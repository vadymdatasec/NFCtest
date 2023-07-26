public class org.apache.log4j.helpers.BoundedFIFO {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public org.apache.log4j.spi.LoggingEvent a;
	 public Integer b;
	 public Integer c;
	 public Integer d;
	 public Integer e;
	 /* # direct methods */
	 public org.apache.log4j.helpers.BoundedFIFO ( ) {
		 /* .locals 3 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 2 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
		 /* .line 3 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
		 /* .line 4 */
		 /* iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* if-lt p1, v0, :cond_0 */
		 /* .line 5 */
		 /* iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
		 /* .line 6 */
		 /* new-array p1, p1, [Lorg/apache/log4j/spi/LoggingEvent; */
		 this.a = p1;
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
public Integer a ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* if-ge p1, p2, :cond_0 */
} // :cond_0
/* move p1, p2 */
} // :goto_0
} // .end method
public org.apache.log4j.spi.LoggingEvent get ( ) {
/* .locals 4 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
v0 = this.a;
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
/* aget-object v3, v0, v2 */
/* .line 3 */
/* aput-object v1, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 4 */
/* iput v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* if-ne v2, v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 5 */
/* iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
/* .line 6 */
} // :cond_1
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
} // .end method
public Integer getMaxSize ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
} // .end method
public Boolean isFull ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Integer length ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
} // .end method
public void put ( org.apache.log4j.spi.LoggingEvent p0 ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* if-eq v0, v1, :cond_1 */
/* .line 2 */
v0 = this.a;
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
/* aput-object p1, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 3 */
/* iput v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
/* if-ne v2, v1, :cond_0 */
int p1 = 0; // const/4 p1, 0x0
/* .line 4 */
/* iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
/* .line 5 */
} // :cond_0
/* iget p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* add-int/lit8 p1, p1, 0x1 */
/* iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
} // :cond_1
return;
} // .end method
public synchronized void resize ( Integer p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
/* .line 1 */
try { // :try_start_0
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne p1, v0, :cond_0 */
/* .line 2 */
/* monitor-exit p0 */
return;
/* .line 3 */
} // :cond_0
try { // :try_start_1
/* new-array v0, p1, [Lorg/apache/log4j/spi/LoggingEvent; */
/* .line 4 */
/* iget v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
/* sub-int/2addr v1, v2 */
/* .line 5 */
v1 = (( org.apache.log4j.helpers.BoundedFIFO ) p0 ).a ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I
/* .line 6 */
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
v1 = (( org.apache.log4j.helpers.BoundedFIFO ) p0 ).a ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I
/* .line 7 */
v2 = this.a;
/* iget v3, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
int v4 = 0; // const/4 v4, 0x0
java.lang.System .arraycopy ( v2,v3,v0,v4,v1 );
/* .line 8 */
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* if-ge v1, v2, :cond_1 */
/* if-ge v1, p1, :cond_1 */
/* .line 9 */
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* sub-int/2addr v2, v1 */
/* sub-int v3, p1, v1 */
/* .line 10 */
v2 = (( org.apache.log4j.helpers.BoundedFIFO ) p0 ).a ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lorg/apache/log4j/helpers/BoundedFIFO;->a(II)I
/* .line 11 */
v3 = this.a;
java.lang.System .arraycopy ( v3,v4,v0,v1,v2 );
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* .line 12 */
} // :goto_0
this.a = v0;
/* .line 13 */
/* iput p1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* .line 14 */
/* iput v4, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->c:I */
/* add-int/2addr v1, v2 */
/* .line 15 */
/* iput v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
/* .line 16 */
/* iput v1, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
/* if-ne v1, p1, :cond_2 */
/* .line 17 */
/* iput v4, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->d:I */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 18 */
} // :cond_2
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception p1 */
/* monitor-exit p0 */
/* throw p1 */
} // .end method
public Boolean wasEmpty ( ) {
/* .locals 2 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
public Boolean wasFull ( ) {
/* .locals 3 */
/* .line 1 */
/* iget v0, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->b:I */
int v1 = 1; // const/4 v1, 0x1
/* add-int/2addr v0, v1 */
/* iget v2, p0, Lorg/apache/log4j/helpers/BoundedFIFO;->e:I */
/* if-ne v0, v2, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
} // .end method
