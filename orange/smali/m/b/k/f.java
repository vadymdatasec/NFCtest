public class m.b.k.f extends java.util.ArrayList {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList<", */
	 /* "Lm/b/i/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # direct methods */
public m.b.k.f ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V */
	 return;
} // .end method
public m.b.k.f ( ) {
	 /* .locals 0 */
	 /* .line 2 */
	 /* invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V */
	 return;
} // .end method
public m.b.k.f ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/util/List<", */
	 /* "Lm/b/i/l;", */
	 /* ">;)V" */
	 /* } */
} // .end annotation
/* .line 3 */
/* invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
return;
} // .end method
/* # virtual methods */
public m.b.i.l a ( ) {
/* .locals 1 */
/* .line 1 */
v0 = (( java.util.ArrayList ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
(( java.util.ArrayList ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lm/b/i/l; */
} // :goto_0
} // .end method
public java.lang.String b ( ) {
/* .locals 4 */
/* .line 1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 2 */
(( java.util.ArrayList ) p0 ).iterator ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lm/b/i/l; */
/* .line 3 */
v3 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "\n"; // const-string v3, "\n"
/* .line 4 */
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 5 */
} // :cond_0
(( m.b.i.t ) v2 ).j ( ); // invoke-virtual {v2}, Lm/b/i/t;->j()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 6 */
} // :cond_1
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( m.b.k.f ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/k/f;->clone()Lm/b/k/f;
} // .end method
public m.b.k.f clone ( ) {
/* .locals 3 */
/* .line 2 */
/* new-instance v0, Lm/b/k/f; */
v1 = (( java.util.ArrayList ) p0 ).size ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
/* invoke-direct {v0, v1}, Lm/b/k/f;-><init>(I)V */
/* .line 3 */
(( java.util.ArrayList ) p0 ).iterator ( ); // invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v2, Lm/b/i/l; */
/* .line 4 */
(( m.b.i.l ) v2 ).clone ( ); // invoke-virtual {v2}, Lm/b/i/l;->clone()Lm/b/i/l;
(( java.util.ArrayList ) v0 ).add ( v2 ); // invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_0
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.k.f ) p0 ).b ( ); // invoke-virtual {p0}, Lm/b/k/f;->b()Ljava/lang/String;
} // .end method
