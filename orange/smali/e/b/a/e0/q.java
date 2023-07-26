public class e.b.a.e0.q {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public java.lang.Class a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Class<", */
	 /* "*>;" */
	 /* } */
} // .end annotation
} // .end field
public java.lang.Class b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
public java.lang.Class c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Class<", */
/* "*>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.b.a.e0.q ( ) {
/* .locals 0 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public e.b.a.e0.q ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 3 */
(( e.b.a.e0.q ) p0 ).a ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Le/b/a/e0/q;->a(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
return;
} // .end method
/* # virtual methods */
public void a ( java.lang.Class p0, java.lang.Class p1, java.lang.Class p2 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;", */
/* "Ljava/lang/Class<", */
/* "*>;)V" */
/* } */
} // .end annotation
/* .line 1 */
this.a = p1;
/* .line 2 */
this.b = p2;
/* .line 3 */
this.c = p3;
return;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
if ( p1 != null) { // if-eqz p1, :cond_5
/* .line 1 */
/* const-class v2, Le/b/a/e0/q; */
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v2, v3, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Le/b/a/e0/q; */
/* .line 3 */
v2 = this.a;
v3 = this.a;
v2 = (( java.lang.Object ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_2 */
/* .line 4 */
} // :cond_2
v2 = this.b;
v3 = this.b;
v2 = (( java.lang.Object ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
/* .line 5 */
} // :cond_3
v2 = this.c;
p1 = this.c;
p1 = e.b.a.e0.t .b ( v2,p1 );
/* if-nez p1, :cond_4 */
} // :cond_4
} // :cond_5
} // :goto_0
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
v0 = (( java.lang.Object ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
v1 = this.b;
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 3 */
v1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( java.lang.Object ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "MultiClassKey{first="; // const-string v1, "MultiClassKey{first="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.a;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v1 = ", second="; // const-string v1, ", second="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* const/16 v1, 0x7d */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
