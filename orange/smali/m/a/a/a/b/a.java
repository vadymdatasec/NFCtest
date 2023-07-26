public class m.a.a.a.b.a implements java.util.Iterator {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Iterator<", */
	 /* "TE;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public Integer b;
public Integer c;
public Boolean d;
public final m.a.a.a.b.b e; //synthetic
/* # direct methods */
public m.a.a.a.b.a ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 this.e = p1;
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 p1 = this.e;
	 p1 = 	 m.a.a.a.b.b .a ( p1 );
	 /* iput p1, p0, Lm/a/a/a/b/a;->b:I */
	 int p1 = -1; // const/4 p1, -0x1
	 /* .line 3 */
	 /* iput p1, p0, Lm/a/a/a/b/a;->c:I */
	 /* .line 4 */
	 p1 = this.e;
	 p1 = 	 m.a.a.a.b.b .b ( p1 );
	 /* iput-boolean p1, p0, Lm/a/a/a/b/a;->d:Z */
	 return;
} // .end method
/* # virtual methods */
public Boolean hasNext ( ) {
	 /* .locals 2 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lm/a/a/a/b/a;->d:Z */
	 /* if-nez v0, :cond_1 */
	 /* iget v0, p0, Lm/a/a/a/b/a;->b:I */
	 v1 = this.e;
	 v1 = 	 m.a.a.a.b.b .c ( v1 );
	 /* if-eq v0, v1, :cond_0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_1
} // :goto_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // .end method
public java.lang.Object next ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TE;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = (( m.a.a.a.b.a ) p0 ).hasNext ( ); // invoke-virtual {p0}, Lm/a/a/a/b/a;->hasNext()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
/* iput-boolean v0, p0, Lm/a/a/a/b/a;->d:Z */
/* .line 3 */
/* iget v0, p0, Lm/a/a/a/b/a;->b:I */
/* iput v0, p0, Lm/a/a/a/b/a;->c:I */
/* .line 4 */
v1 = this.e;
v0 = m.a.a.a.b.b .b ( v1,v0 );
/* iput v0, p0, Lm/a/a/a/b/a;->b:I */
/* .line 5 */
v0 = this.e;
m.a.a.a.b.b .d ( v0 );
/* iget v1, p0, Lm/a/a/a/b/a;->c:I */
/* aget-object v0, v0, v1 */
/* .line 6 */
} // :cond_0
/* new-instance v0, Ljava/util/NoSuchElementException; */
/* invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V */
/* throw v0 */
} // .end method
public void remove ( ) {
/* .locals 7 */
/* .line 1 */
/* iget v0, p0, Lm/a/a/a/b/a;->c:I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_4 */
/* .line 2 */
v2 = this.e;
v2 = m.a.a.a.b.b .a ( v2 );
/* if-ne v0, v2, :cond_0 */
/* .line 3 */
v0 = this.e;
(( m.a.a.a.b.b ) v0 ).remove ( ); // invoke-virtual {v0}, Lm/a/a/a/b/b;->remove()Ljava/lang/Object;
/* .line 4 */
/* iput v1, p0, Lm/a/a/a/b/a;->c:I */
return;
/* .line 5 */
} // :cond_0
/* iget v0, p0, Lm/a/a/a/b/a;->c:I */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 6 */
v2 = this.e;
v2 = m.a.a.a.b.b .a ( v2 );
/* iget v3, p0, Lm/a/a/a/b/a;->c:I */
int v4 = 0; // const/4 v4, 0x0
/* if-ge v2, v3, :cond_1 */
v2 = this.e;
v2 = m.a.a.a.b.b .c ( v2 );
/* if-ge v0, v2, :cond_1 */
/* .line 7 */
v2 = this.e;
m.a.a.a.b.b .d ( v2 );
v3 = this.e;
m.a.a.a.b.b .d ( v3 );
/* iget v5, p0, Lm/a/a/a/b/a;->c:I */
v6 = this.e;
v6 = m.a.a.a.b.b .c ( v6 );
/* sub-int/2addr v6, v0 */
java.lang.System .arraycopy ( v2,v0,v3,v5,v6 );
/* .line 8 */
} // :cond_1
} // :goto_0
v2 = this.e;
v2 = m.a.a.a.b.b .c ( v2 );
/* if-eq v0, v2, :cond_3 */
/* .line 9 */
v2 = this.e;
v2 = m.a.a.a.b.b .e ( v2 );
/* if-lt v0, v2, :cond_2 */
/* .line 10 */
v2 = this.e;
m.a.a.a.b.b .d ( v2 );
/* add-int/lit8 v0, v0, -0x1 */
v3 = this.e;
m.a.a.a.b.b .d ( v3 );
/* aget-object v3, v3, v4 */
/* aput-object v3, v2, v0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 11 */
} // :cond_2
v2 = this.e;
m.a.a.a.b.b .d ( v2 );
v3 = this.e;
v3 = m.a.a.a.b.b .c ( v3,v0 );
v5 = this.e;
m.a.a.a.b.b .d ( v5 );
/* aget-object v5, v5, v0 */
/* aput-object v5, v2, v3 */
/* .line 12 */
v2 = this.e;
v0 = m.a.a.a.b.b .b ( v2,v0 );
/* .line 13 */
} // :cond_3
} // :goto_1
/* iput v1, p0, Lm/a/a/a/b/a;->c:I */
/* .line 14 */
v0 = this.e;
v1 = m.a.a.a.b.b .c ( v0 );
v1 = m.a.a.a.b.b .c ( v0,v1 );
m.a.a.a.b.b .a ( v0,v1 );
/* .line 15 */
v0 = this.e;
m.a.a.a.b.b .d ( v0 );
v1 = this.e;
v1 = m.a.a.a.b.b .c ( v1 );
int v2 = 0; // const/4 v2, 0x0
/* aput-object v2, v0, v1 */
/* .line 16 */
v0 = this.e;
m.a.a.a.b.b .a ( v0,v4 );
/* .line 17 */
v0 = this.e;
/* iget v1, p0, Lm/a/a/a/b/a;->b:I */
v0 = m.a.a.a.b.b .c ( v0,v1 );
/* iput v0, p0, Lm/a/a/a/b/a;->b:I */
return;
/* .line 18 */
} // :cond_4
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw v0 */
} // .end method
