public class m.b.i.b implements java.lang.Iterable implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/lang/Iterable<", */
	 /* "Lm/b/i/a;", */
	 /* ">;", */
	 /* "Ljava/lang/Cloneable;" */
	 /* } */
} // .end annotation
/* # instance fields */
public java.util.LinkedHashMap b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedHashMap<", */
/* "Ljava/lang/String;", */
/* "Lm/b/i/a;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public m.b.i.b ( ) {
/* .locals 1 */
/* .line 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
this.b = v0;
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( java.lang.String p0 ) {
/* .locals 2 */
/* .line 1 */
m.b.h.j .b ( p1 );
/* .line 2 */
v0 = this.b;
final String v1 = ""; // const-string v1, ""
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
(( java.util.LinkedHashMap ) v0 ).get ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lm/b/i/a; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 4 */
(( m.b.i.a ) p1 ).getValue ( ); // invoke-virtual {p1}, Lm/b/i/a;->getValue()Ljava/lang/String;
} // :cond_1
} // .end method
public java.util.List a ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List<", */
/* "Lm/b/i/a;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 15 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 16 */
java.util.Collections .emptyList ( );
/* .line 17 */
} // :cond_0
/* new-instance v0, Ljava/util/ArrayList; */
v1 = this.b;
v1 = (( java.util.LinkedHashMap ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I
/* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
/* .line 18 */
v1 = this.b;
(( java.util.LinkedHashMap ) v1 ).entrySet ( ); // invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Ljava/util/Map$Entry; */
/* .line 19 */
/* .line 20 */
} // :cond_1
java.util.Collections .unmodifiableList ( v0 );
} // .end method
public void a ( java.lang.Appendable p0, Object p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 21 */
v0 = this.b;
/* if-nez v0, :cond_0 */
return;
/* .line 22 */
} // :cond_0
(( java.util.LinkedHashMap ) v0 ).entrySet ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
v1 = } // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 23 */
/* check-cast v1, Lm/b/i/a; */
final String v2 = " "; // const-string v2, " "
/* .line 24 */
/* .line 25 */
(( m.b.i.a ) v1 ).a ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Lm/b/i/a;->a(Ljava/lang/Appendable;Lm/b/i/g;)V
} // :cond_1
return;
} // .end method
public void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .line 5 */
/* new-instance v0, Lm/b/i/a; */
/* invoke-direct {v0, p1, p2}, Lm/b/i/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 6 */
(( m.b.i.b ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lm/b/i/b;->a(Lm/b/i/a;)V
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 7 */
m.b.h.j .a ( p1 );
/* .line 8 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 9 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V */
this.b = v0;
/* .line 10 */
} // :cond_0
v0 = this.b;
(( m.b.i.a ) p1 ).getKey ( ); // invoke-virtual {p1}, Lm/b/i/a;->getKey()Ljava/lang/String;
(( java.util.LinkedHashMap ) v0 ).put ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void a ( Object p0 ) {
/* .locals 2 */
/* .line 11 */
v0 = (( m.b.i.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/b/i/b;->size()I
/* if-nez v0, :cond_0 */
return;
/* .line 12 */
} // :cond_0
v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 13 */
/* new-instance v0, Ljava/util/LinkedHashMap; */
v1 = (( m.b.i.b ) p1 ).size ( ); // invoke-virtual {p1}, Lm/b/i/b;->size()I
/* invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V */
this.b = v0;
/* .line 14 */
} // :cond_1
v0 = this.b;
p1 = this.b;
(( java.util.LinkedHashMap ) v0 ).putAll ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->putAll(Ljava/util/Map;)V
return;
} // .end method
public java.lang.String b ( ) {
/* .locals 3 */
/* .line 6 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 7 */
try { // :try_start_0
/* new-instance v1, Lm/b/i/i; */
final String v2 = ""; // const-string v2, ""
/* invoke-direct {v1, v2}, Lm/b/i/i;-><init>(Ljava/lang/String;)V */
(( m.b.i.i ) v1 ).E ( ); // invoke-virtual {v1}, Lm/b/i/i;->E()Lm/b/i/g;
(( m.b.i.b ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lm/b/i/b;->a(Ljava/lang/Appendable;Lm/b/i/g;)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 8 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
/* .line 9 */
/* new-instance v1, Lorg/jsoup/SerializationException; */
/* invoke-direct {v1, v0}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
/* .locals 4 */
/* .line 1 */
m.b.h.j .b ( p1 );
/* .line 2 */
v0 = this.b;
final String v1 = ""; // const-string v1, ""
/* if-nez v0, :cond_0 */
/* .line 3 */
} // :cond_0
(( java.util.LinkedHashMap ) v0 ).keySet ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;
v2 = } // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .line 4 */
v3 = (( java.lang.String ) v2 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 5 */
p1 = this.b;
(( java.util.LinkedHashMap ) p1 ).get ( v2 ); // invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p1, Lm/b/i/a; */
(( m.b.i.a ) p1 ).getValue ( ); // invoke-virtual {p1}, Lm/b/i/a;->getValue()Ljava/lang/String;
} // :cond_2
} // .end method
public Boolean c ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
p1 = (( java.util.LinkedHashMap ) v0 ).containsKey ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z
if ( p1 != null) { // if-eqz p1, :cond_0
int p1 = 1; // const/4 p1, 0x1
} // :cond_0
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/CloneNotSupportedException; */
/* } */
} // .end annotation
/* .line 1 */
(( m.b.i.b ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/b;->clone()Lm/b/i/b;
} // .end method
public m.b.i.b clone ( ) {
/* .locals 5 */
/* .line 2 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 3 */
/* new-instance v0, Lm/b/i/b; */
/* invoke-direct {v0}, Lm/b/i/b;-><init>()V */
/* .line 4 */
} // :cond_0
try { // :try_start_0
/* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
/* check-cast v0, Lm/b/i/b; */
/* :try_end_0 */
/* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 5 */
/* new-instance v1, Ljava/util/LinkedHashMap; */
v2 = this.b;
v2 = (( java.util.LinkedHashMap ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/LinkedHashMap;->size()I
/* invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V */
this.b = v1;
/* .line 6 */
(( m.b.i.b ) p0 ).iterator ( ); // invoke-virtual {p0}, Lm/b/i/b;->iterator()Ljava/util/Iterator;
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_1
/* check-cast v2, Lm/b/i/a; */
/* .line 7 */
v3 = this.b;
(( m.b.i.a ) v2 ).getKey ( ); // invoke-virtual {v2}, Lm/b/i/a;->getKey()Ljava/lang/String;
(( m.b.i.a ) v2 ).clone ( ); // invoke-virtual {v2}, Lm/b/i/a;->clone()Lm/b/i/a;
(( java.util.LinkedHashMap ) v3 ).put ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_1
/* :catch_0 */
/* move-exception v0 */
/* .line 8 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public Boolean d ( java.lang.String p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
/* if-nez v0, :cond_0 */
/* .line 2 */
} // :cond_0
(( java.util.LinkedHashMap ) v0 ).keySet ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;
v2 = } // :cond_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .line 3 */
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
int p1 = 1; // const/4 p1, 0x1
} // :cond_2
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 3 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lm/b/i/b; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lm/b/i/b; */
/* .line 3 */
v1 = this.b;
p1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
p1 = (( java.util.LinkedHashMap ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_4 */
} // :cond_2
/* if-nez p1, :cond_3 */
} // :cond_3
} // :goto_0
int v0 = 0; // const/4 v0, 0x0
} // :cond_4
} // :goto_1
} // .end method
public Integer hashCode ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.util.LinkedHashMap ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->hashCode()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // .end method
public java.util.Iterator iterator ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Iterator<", */
/* "Lm/b/i/a;", */
/* ">;" */
/* } */
} // .end annotation
/* .line 1 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( java.util.LinkedHashMap ) v0 ).isEmpty ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 2 */
} // :cond_0
v0 = this.b;
(( java.util.LinkedHashMap ) v0 ).values ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;
/* .line 3 */
} // :cond_1
} // :goto_0
java.util.Collections .emptyList ( );
} // .end method
public Integer size ( ) {
/* .locals 1 */
/* .line 1 */
v0 = this.b;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* .line 2 */
} // :cond_0
v0 = (( java.util.LinkedHashMap ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.i.b ) p0 ).b ( ); // invoke-virtual {p0}, Lm/b/i/b;->b()Ljava/lang/String;
} // .end method
