# Glog

## Query

``` sql
SET @start = current_date,
    @end = DATE_ADD(current_date, INTERVAL 1 DAY);

# 1일 총 PV count
select @start, @end, count(*)
from urls u,
     view_counter vc
where u.url_seq = vc.url_seq
  and vc.acs_time > @start
  and vc.acs_time < @end
order by vc.acs_time desc;

# 1일 Page Access Count
select count(*),
       substr(u.url_value, 26, length(u.url_value)) as URL,
       vc.acs_time
from urls u,
     view_counter vc
where u.url_seq = vc.url_seq
  and vc.acs_time > @start
  and vc.acs_time < @end
group by u.url_value
order by count(*) desc;
```
