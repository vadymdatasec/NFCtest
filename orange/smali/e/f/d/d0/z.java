public class e.f.d.d0.z implements java.util.Map$Entry {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "<V:", */
	 /* "Ljava/lang/Object;", */
	 /* ">", */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Map$Entry<", */
	 /* "Ljava/lang/String;", */
	 /* "TV;>;" */
	 /* } */
} // .end annotation
/* # instance fields */
public final java.lang.String b;
public java.lang.Object c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "TV;" */
/* } */
} // .end annotation
} // .end field
public final Integer d;
public e.f.d.d0.z e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public e.f.d.d0.z f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
public e.f.d.d0.z g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Le/f/d/d0/z<", */
/* "TV;>;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public e.f.d.d0.z ( ) {
/* .locals 7 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* .line 1 */
/* invoke-direct/range {v0 ..v6}, Le/f/d/d0/z;-><init>(Ljava/lang/String;Ljava/lang/Object;ILe/f/d/d0/z;Le/f/d/d0/z;Le/f/d/d0/z;)V */
/* .line 2 */
this.g = p0;
this.f = p0;
return;
} // .end method
public e.f.d.d0.z ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "TV;I", */
/* "Le/f/d/d0/z<", */
/* "TV;>;", */
/* "Le/f/d/d0/z<", */
/* "TV;>;", */
/* "Le/f/d/d0/z<", */
/* "TV;>;)V" */
/* } */
} // .end annotation
/* .line 3 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 4 */
this.b = p1;
/* .line 5 */
this.c = p2;
/* .line 6 */
/* iput p3, p0, Le/f/d/d0/z;->d:I */
/* .line 7 */
this.e = p4;
/* .line 8 */
this.f = p5;
/* .line 9 */
this.g = p6;
return;
} // .end method
/* # virtual methods */
public final Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
/* .line 1 */
/* instance-of v0, p1, Ljava/util/Map$Entry; */
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
/* check-cast p1, Ljava/util/Map$Entry; */
/* .line 3 */
/* .line 4 */
v2 = this.b;
p1 = (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
p1 = this.c;
/* if-nez p1, :cond_1 */
/* if-nez v0, :cond_2 */
} // :cond_1
p1 = (( java.lang.Object ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_2
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
} // :cond_2
} // .end method
public java.lang.Object getKey ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( e.f.d.d0.z ) p0 ).getKey ( ); // invoke-virtual {p0}, Le/f/d/d0/z;->getKey()Ljava/lang/String;
} // .end method
public final java.lang.String getKey ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
} // .end method
public final java.lang.Object getValue ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()TV;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
} // .end method
public final Integer hashCode ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // :goto_0
v2 = this.c;
/* if-nez v2, :cond_1 */
} // :cond_1
v1 = (( java.lang.Object ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I
} // :goto_1
/* xor-int/2addr v0, v1 */
} // .end method
public final java.lang.Object setValue ( java.lang.Object p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(TV;)TV;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.c;
/* .line 2 */
this.c = p1;
} // .end method
public final java.lang.String toString ( ) {
/* .locals 2 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
