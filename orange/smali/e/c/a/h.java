public class e.c.a.h {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/i;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer b;
/* # direct methods */
public e.c.a.h ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
/* iput v0, p0, Le/c/a/h;->b:I */
return;
} // .end method
/* # virtual methods */
public e.c.a.i a ( Integer p0 ) {
/* .locals 1 */
/* .line 4 */
v0 = this.a;
/* check-cast p1, Le/c/a/i; */
} // .end method
public void a ( ) {
/* .locals 1 */
/* .line 5 */
/* iget v0, p0, Le/c/a/h;->b:I */
/* add-int/lit8 v0, v0, 0x64 */
/* iput v0, p0, Le/c/a/h;->b:I */
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
/* .line 3 */
} // :cond_0
v0 = this.a;
return;
} // .end method
public void b ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/c/a/h;->b:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Le/c/a/h;->b:I */
return;
} // .end method
public void c ( ) {
/* .locals 1 */
/* .line 1 */
/* iget v0, p0, Le/c/a/h;->b:I */
/* add-int/lit16 v0, v0, 0x2710 */
/* iput v0, p0, Le/c/a/h;->b:I */
return;
} // .end method
public Boolean d ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
v0 = } // :cond_0
} // :goto_0
} // .end method
public Integer e ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
v0 = } // :cond_0
} // :goto_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2 */
v1 = this.a;
v2 = } // :goto_0
/* if-nez v2, :cond_0 */
/* const/16 v1, 0x28 */
/* .line 3 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* iget v1, p0, Le/c/a/h;->b:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* const/16 v1, 0x29 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 4 */
} // :cond_0
/* check-cast v2, Le/c/a/i; */
/* .line 5 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v2, 0x20 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
