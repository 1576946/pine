import pymysql
import codecs

#读取数据库中的数据（data）

conn=pymysql.connect(host='localhost',user='root',password='root',
    database='stus',charset="utf8")
cursor = conn.cursor()
sql = "select data from qqhome"
cursor.execute(sql)
result = cursor.fetchall()
with codecs.open('D:/python/Qqhome/1.txt','w','utf8') as f:
    for i in result:
        f.write("".join(i))
    f.close()
conn.close()