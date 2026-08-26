with ranked as (
    select 
    d.name as Department,
    e.name as Employee,
    e.salary as salary,
    rank() over (partition by e.departmentId order by e.salary desc) as rn
    from Employee e join Department d
    on e.departmentId = d.id
)
select Department, Employee, Salary
from ranked where rn=1;