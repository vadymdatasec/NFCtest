public class e.h.d.a.a.n.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final Integer a;
	 public java.util.Date b;
	 public Integer c;
	 public java.util.List d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.h.d.a.a.n.i ( ) {
/* .locals 3 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 3 */
(( e.h.d.a.a.n.i ) p0 ).e ( ); // invoke-virtual {p0}, Le/h/d/a/a/n/i;->e()V
/* .line 4 */
/* iput p2, p0, Le/h/d/a/a/n/i;->a:I */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
} // :goto_0
/* if-gt v0, p2, :cond_1 */
/* .line 5 */
v1 = this.d;
java.lang.Integer .valueOf ( p1 );
/* add-int/2addr v0, p1 */
/* mul-int p1, p1, p3 */
/* if-le p1, p4, :cond_0 */
/* move p1, p4 */
} // :cond_1
return;
} // .end method
/* # virtual methods */
public Integer a ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/h/d/a/a/n/i;->c:I */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public Long b ( ) {
/* .locals 4 */
/* .line 1 */
v0 = this.b;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* iget v2, p0, Le/h/d/a/a/n/i;->a:I */
/* int-to-long v2, v2 */
/* add-long/2addr v0, v2 */
e.h.d.a.a.n.t .b ( );
(( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
public Boolean c ( ) {
/* .locals 5 */
/* .line 1 */
e.h.d.a.a.n.t .b ( );
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
v2 = this.b;
(( java.util.Date ) v2 ).getTime ( ); // invoke-virtual {v2}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* sub-long/2addr v0, v2 */
/* iget v2, p0, Le/h/d/a/a/n/i;->a:I */
/* int-to-long v2, v2 */
/* cmp-long v4, v0, v2 */
/* if-ltz v4, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public Long d ( ) {
/* .locals 8 */
/* .line 1 */
v0 = this.d;
/* iget v1, p0, Le/h/d/a/a/n/i;->c:I */
/* add-int/lit8 v2, v1, 0x1 */
/* iput v2, p0, Le/h/d/a/a/n/i;->c:I */
/* check-cast v0, Ljava/lang/Integer; */
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 2 */
e.h.d.a.a.n.t .b ( );
/* int-to-long v2, v0 */
/* .line 3 */
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v4 */
/* add-long/2addr v4, v2 */
v0 = this.b;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v6 */
/* sub-long/2addr v4, v6 */
/* iget v0, p0, Le/h/d/a/a/n/i;->a:I */
/* int-to-long v6, v0 */
/* cmp-long v0, v4, v6 */
/* if-ltz v0, :cond_0 */
/* .line 4 */
v0 = this.b;
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v2 */
/* iget v0, p0, Le/h/d/a/a/n/i;->a:I */
/* int-to-long v4, v0 */
/* add-long/2addr v2, v4 */
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v0 */
/* sub-long/2addr v2, v0 */
} // :cond_0
/* return-wide v2 */
} // .end method
public void e ( ) {
/* .locals 1 */
/* .line 1 */
e.h.d.a.a.n.t .b ( );
this.b = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput v0, p0, Le/h/d/a/a/n/i;->c:I */
return;
} // .end method
