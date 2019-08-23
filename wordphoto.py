import matplotlib.pyplot as plt
from wordcloud import WordCloud,ImageColorGenerator,STOPWORDS
import jieba
import numpy as np
from PIL import Image
from collections import Counter
import re
import codecs




#读入背景图片
abel_mask = np.array(Image.open("D:/python/Qqhome/1.png"))




#读取要生成词云的文件
ext_from_file_with_apath = open('D:/python/Qqhome/1.txt',encoding='utf').read()
resultword=re.sub("[A-Za-z0-9\[\`\~\!\@\#\$\^\&\*\(\)\=\|\{\}\'\:\;\'\,\[\]\.\<\>\/\?\~\。\@\#\\\&\*\%\"]", "",ext_from_file_with_apath)
res = list(jieba.cut(resultword))
lists = Counter(res).most_common(350)

str = ""
for ls in lists:
    str += (ls[0]+" ")


# 设置停用词 
sw = set(STOPWORDS)
sw.add("哈哈")
sw.add("我")
sw.add("我们")
sw.add("还是")
sw.add("因为")
sw.add("什么")
sw.add("一个")
sw.add("不是")
sw.add("这个")
sw.add("你们")
sw.add("感觉")
sw.add("就是")
sw.add("不会")
sw.add("没有")
sw.add("这么")
sw.add("知道")
sw.add("真的")
sw.add("这样")
sw.add("不要")
sw.add("明天")
sw.add("今日")
sw.add("现在")
sw.add("一天")
sw.add("今天")
sw.add("可以")
sw.add("自己")


my_wordcloud = WordCloud(
            #background_color='white',    # 设置背景颜色
            mask = abel_mask,        # 设置背景图片
            max_words = 200,            # 设置最大现实的字数
            stopwords = sw,        # 设置停用词
            width=1100,
            height=1100,
            font_path = 'C:/Users/Windows/fonts/simkai.ttf',# 设置字体格式，如不设置显示不了中文
            max_font_size = 120,            # 设置字体最大值
            random_state = 30,            # 设置有多少种随机生成状态，即有多少种配色方案
                scale=5
                ).generate(str)

# 根据图片生成词云颜色
image_colors = ImageColorGenerator(abel_mask,default_color='white')

# 以下代码显示图片
plt.imshow(my_wordcloud)
plt.axis("off")
plt.show()