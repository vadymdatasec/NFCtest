public class org.apache.log4j.helpers.CyclicBuffer {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.spi.LoggingEvent a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public org.apache.log4j.helpers.CyclicBuffer ( ) {
		 /* .locals 3 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/IllegalArgumentException; */
		 /* } */
	 } // .end annotation
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 int v0 = 1; // const/4 v0, 0x1
	 /* if-lt p1, v0, :cond_0 */
	 /* .line 2 */
	 /* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
	 /* .line 3 */
	 /* new-array p1, p1, [Lorg/apache/log4j/spi/LoggingEvent; */
	 this.a = p1;
	 int p1 = 0; // const/4 p1, 0x0
	 /* .line 4 */
	 /* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
	 /* .line 5 */
	 /* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
	 /* .line 6 */
	 /* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
	 return;
	 /* .line 7 */
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "The maxSize argument ("; // const-string v2, "The maxSize argument ("
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String p1 = ") is not a positive integer."; // const-string p1, ") is not a positive integer."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
/* # virtual methods */
public void add ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
/* iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
/* aput-object p1, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 2 */
/* iput v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
/* iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
int v0 = 0; // const/4 v0, 0x0
/* if-ne v1, p1, :cond_0 */
/* .line 3 */
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
/* .line 4 */
} // :cond_0
/* iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
/* if-ge p1, v1, :cond_1 */
/* add-int/lit8 p1, p1, 0x1 */
/* .line 5 */
/* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* .line 6 */
} // :cond_1
/* iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* if-ne p1, v1, :cond_2 */
/* .line 7 */
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
} // :cond_2
} // :goto_0
return;
} // .end method
public org.apache.log4j.spi.LoggingEvent get ( ) {
/* .locals 4 */
/* .line 3 */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
int v1 = 0; // const/4 v1, 0x0
/* if-lez v0, :cond_1 */
/* add-int/lit8 v0, v0, -0x1 */
/* .line 4 */
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* .line 5 */
v0 = this.a;
/* iget v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* aget-object v3, v0, v2 */
/* .line 6 */
/* aput-object v1, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 7 */
/* iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
/* if-ne v2, v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 8 */
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
} // :cond_0
/* move-object v1, v3 */
} // :cond_1
} // .end method
public org.apache.log4j.spi.LoggingEvent get ( Integer p0 ) {
/* .locals 2 */
/* if-ltz p1, :cond_1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* if-lt p1, v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
/* iget v1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* add-int/2addr v1, p1 */
/* iget p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
/* rem-int/2addr v1, p1 */
/* aget-object p1, v0, v1 */
} // :cond_1
} // :goto_0
int p1 = 0; // const/4 p1, 0x0
} // .end method
public Integer getMaxSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
} // .end method
public Integer length ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
} // .end method
public void resize ( Integer p0 ) {
/* .locals 7 */
/* if-ltz p1, :cond_5 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* if-ne p1, v0, :cond_0 */
return;
/* .line 2 */
} // :cond_0
/* new-array v1, p1, [Lorg/apache/log4j/spi/LoggingEvent; */
/* if-ge p1, v0, :cond_1 */
/* move v0, p1 */
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v0, :cond_3 */
/* .line 3 */
v4 = this.a;
/* iget v5, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* aget-object v6, v4, v5 */
/* aput-object v6, v1, v3 */
int v6 = 0; // const/4 v6, 0x0
/* .line 4 */
/* aput-object v6, v4, v5 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 5 */
/* iput v5, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* iget v4, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* if-ne v5, v4, :cond_2 */
/* .line 6 */
/* iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 7 */
} // :cond_3
this.a = v1;
/* .line 8 */
/* iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->b:I */
/* .line 9 */
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->d:I */
/* .line 10 */
/* iput p1, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->e:I */
/* if-ne v0, p1, :cond_4 */
/* .line 11 */
/* iput v2, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
/* .line 12 */
} // :cond_4
/* iput v0, p0, Lorg/apache/log4j/helpers/CyclicBuffer;->c:I */
} // :goto_1
return;
/* .line 13 */
} // :cond_5
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
final String v2 = "Negative array size ["; // const-string v2, "Negative array size ["
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String p1 = "] not allowed."; // const-string p1, "] not allowed."
(( java.lang.StringBuffer ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
