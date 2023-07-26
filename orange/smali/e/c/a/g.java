public class e.c.a.g {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.util.List a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List<", */
	 /* "Le/c/a/f;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.c.a.g ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.a = v0;
return;
} // .end method
/* # virtual methods */
public java.util.List a ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Le/c/a/f;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 13 */
v0 = this.a;
} // .end method
public void a ( Object p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* .line 2 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.a = v0;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 3 */
} // :goto_0
v1 = v1 = this.a;
/* if-lt v0, v1, :cond_1 */
/* .line 4 */
v0 = this.a;
return;
/* .line 5 */
} // :cond_1
v1 = this.a;
/* check-cast v1, Le/c/a/f; */
/* .line 6 */
v1 = this.a;
/* iget v1, v1, Le/c/a/h;->b:I */
v2 = this.a;
/* iget v2, v2, Le/c/a/h;->b:I */
/* if-le v1, v2, :cond_2 */
/* .line 7 */
v1 = this.a;
return;
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 8 */
v0 = this.a;
/* if-nez v0, :cond_0 */
return;
/* .line 9 */
} // :cond_0
v0 = this.a;
/* if-nez v0, :cond_1 */
/* .line 10 */
/* new-instance v0, Ljava/util/ArrayList; */
v1 = v1 = this.a;
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
this.a = v0;
/* .line 11 */
} // :cond_1
p1 = this.a;
v0 = } // :goto_0
/* if-nez v0, :cond_2 */
return;
} // :cond_2
/* check-cast v0, Le/c/a/f; */
/* .line 12 */
v1 = this.a;
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
v0 = if ( v0 != null) { // if-eqz v0, :cond_0
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
/* .line 2 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 3 */
v1 = this.a;
v2 = } // :goto_0
/* if-nez v2, :cond_1 */
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 5 */
} // :cond_1
/* check-cast v2, Le/c/a/f; */
/* .line 6 */
(( e.c.a.f ) v2 ).toString ( ); // invoke-virtual {v2}, Le/c/a/f;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v2, 0xa */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
