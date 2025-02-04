SELECT id , movie , description , rating FROM 
Cinema WHERE description!='boring' AND id%2!=0 GROUP BY id 
ORDER BY rating DESC ;