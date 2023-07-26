public class m.b.i.a implements java.util.Map$Entry implements java.lang.Cloneable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Object;", */
	 /* "Ljava/util/Map$Entry<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;", */
	 /* "Ljava/lang/Cloneable;" */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String d;
/* # instance fields */
public java.lang.String b;
public java.lang.String c;
/* # direct methods */
public static m.b.i.a ( ) {
	 /* .locals 30 */
	 final String v0 = "allowfullscreen"; // const-string v0, "allowfullscreen"
	 final String v1 = "async"; // const-string v1, "async"
	 final String v2 = "autofocus"; // const-string v2, "autofocus"
	 final String v3 = "checked"; // const-string v3, "checked"
	 final String v4 = "compact"; // const-string v4, "compact"
	 final String v5 = "declare"; // const-string v5, "declare"
	 final String v6 = "default"; // const-string v6, "default"
	 final String v7 = "defer"; // const-string v7, "defer"
	 final String v8 = "disabled"; // const-string v8, "disabled"
	 final String v9 = "formnovalidate"; // const-string v9, "formnovalidate"
	 final String v10 = "hidden"; // const-string v10, "hidden"
	 final String v11 = "inert"; // const-string v11, "inert"
	 final String v12 = "ismap"; // const-string v12, "ismap"
	 final String v13 = "itemscope"; // const-string v13, "itemscope"
	 final String v14 = "multiple"; // const-string v14, "multiple"
	 final String v15 = "muted"; // const-string v15, "muted"
	 final String v16 = "nohref"; // const-string v16, "nohref"
	 final String v17 = "noresize"; // const-string v17, "noresize"
	 final String v18 = "noshade"; // const-string v18, "noshade"
	 final String v19 = "novalidate"; // const-string v19, "novalidate"
	 final String v20 = "nowrap"; // const-string v20, "nowrap"
	 final String v21 = "open"; // const-string v21, "open"
	 final String v22 = "readonly"; // const-string v22, "readonly"
	 final String v23 = "required"; // const-string v23, "required"
	 final String v24 = "reversed"; // const-string v24, "reversed"
	 final String v25 = "seamless"; // const-string v25, "seamless"
	 final String v26 = "selected"; // const-string v26, "selected"
	 final String v27 = "sortable"; // const-string v27, "sortable"
	 final String v28 = "truespeed"; // const-string v28, "truespeed"
	 final String v29 = "typemustmatch"; // const-string v29, "typemustmatch"
	 /* .line 1 */
	 /* filled-new-array/range {v0 ..v29}, [Ljava/lang/String; */
	 return;
} // .end method
public m.b.i.a ( ) {
	 /* .locals 0 */
	 /* .line 1 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 2 */
	 m.b.h.j .b ( p1 );
	 /* .line 3 */
	 m.b.h.j .a ( p2 );
	 /* .line 4 */
	 (( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
	 this.b = p1;
	 /* .line 5 */
	 this.c = p2;
	 return;
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
	 /* .locals 3 */
	 /* .line 3 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 /* .line 4 */
	 try { // :try_start_0
		 /* new-instance v1, Lm/b/i/i; */
		 final String v2 = ""; // const-string v2, ""
		 /* invoke-direct {v1, v2}, Lm/b/i/i;-><init>(Ljava/lang/String;)V */
		 (( m.b.i.i ) v1 ).E ( ); // invoke-virtual {v1}, Lm/b/i/i;->E()Lm/b/i/g;
		 (( m.b.i.a ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lm/b/i/a;->a(Ljava/lang/Appendable;Lm/b/i/g;)V
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 5 */
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 6 */
		 /* new-instance v1, Lorg/jsoup/SerializationException; */
		 /* invoke-direct {v1, v0}, Lorg/jsoup/SerializationException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public void a ( java.lang.Appendable p0, Object p1 ) {
		 /* .locals 7 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .line 7 */
	 v0 = this.b;
	 /* .line 8 */
	 v0 = 	 (( m.b.i.a ) p0 ).a ( p2 ); // invoke-virtual {p0, p2}, Lm/b/i/a;->a(Lm/b/i/g;)Z
	 /* if-nez v0, :cond_0 */
	 final String v0 = "=\""; // const-string v0, "=\""
	 /* .line 9 */
	 /* .line 10 */
	 v2 = this.c;
	 int v4 = 1; // const/4 v4, 0x1
	 int v5 = 0; // const/4 v5, 0x0
	 int v6 = 0; // const/4 v6, 0x0
	 /* move-object v1, p1 */
	 /* move-object v3, p2 */
	 /* invoke-static/range {v1 ..v6}, Lm/b/i/p;->a(Ljava/lang/Appendable;Ljava/lang/String;Lm/b/i/g;ZZZ)V */
	 /* const/16 p2, 0x22 */
	 /* .line 11 */
} // :cond_0
return;
} // .end method
public void a ( java.lang.String p0 ) {
/* .locals 0 */
/* .line 1 */
m.b.h.j .b ( p1 );
/* .line 2 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
this.b = p1;
return;
} // .end method
public final Boolean a ( Object p0 ) {
/* .locals 2 */
/* .line 12 */
v0 = this.c;
final String v1 = ""; // const-string v1, ""
v0 = (( java.lang.String ) v1 ).equals ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = this.c;
v1 = this.b;
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 13 */
} // :cond_0
(( m.b.i.g ) p1 ).h ( ); // invoke-virtual {p1}, Lm/b/i/g;->h()Lm/b/i/f;
v0 = m.b.i.f.b;
/* if-ne p1, v0, :cond_1 */
/* .line 14 */
p1 = (( m.b.i.a ) p0 ).b ( ); // invoke-virtual {p0}, Lm/b/i/a;->b()Z
if ( p1 != null) { // if-eqz p1, :cond_1
	 int p1 = 1; // const/4 p1, 0x1
} // :cond_1
int p1 = 0; // const/4 p1, 0x0
} // :goto_0
} // .end method
public java.lang.String b ( java.lang.String p0 ) {
/* .locals 1 */
/* .line 1 */
m.b.h.j .a ( p1 );
/* .line 2 */
v0 = this.c;
/* .line 3 */
this.c = p1;
} // .end method
public Boolean b ( ) {
/* .locals 2 */
/* .line 4 */
v0 = m.b.i.a.d;
v1 = this.b;
v0 = java.util.Arrays .binarySearch ( v0,v1 );
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
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
(( m.b.i.a ) p0 ).clone ( ); // invoke-virtual {p0}, Lm/b/i/a;->clone()Lm/b/i/a;
} // .end method
public m.b.i.a clone ( ) {
/* .locals 2 */
/* .line 2 */
try { // :try_start_0
/* invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object; */
/* check-cast v0, Lm/b/i/a; */
/* :try_end_0 */
/* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
/* .line 3 */
/* new-instance v1, Ljava/lang/RuntimeException; */
/* invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v1 */
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p0, p1, :cond_0 */
/* .line 1 */
} // :cond_0
/* instance-of v1, p1, Lm/b/i/a; */
int v2 = 0; // const/4 v2, 0x0
/* if-nez v1, :cond_1 */
/* .line 2 */
} // :cond_1
/* check-cast p1, Lm/b/i/a; */
/* .line 3 */
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_2
v3 = this.b;
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_3 */
} // :cond_2
v1 = this.b;
if ( v1 != null) { // if-eqz v1, :cond_3
} // :goto_0
/* .line 4 */
} // :cond_3
v1 = this.c;
p1 = this.c;
if ( v1 != null) { // if-eqz v1, :cond_4
p1 = (( java.lang.String ) v1 ).equals ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p1, :cond_6 */
} // :cond_4
/* if-nez p1, :cond_5 */
} // :cond_5
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
} // :goto_2
} // .end method
public java.lang.Object getKey ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( m.b.i.a ) p0 ).getKey ( ); // invoke-virtual {p0}, Lm/b/i/a;->getKey()Ljava/lang/String;
} // .end method
public java.lang.String getKey ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.b;
} // .end method
public java.lang.Object getValue ( ) { //bridge//synthethic
/* .locals 1 */
/* .line 1 */
(( m.b.i.a ) p0 ).getValue ( ); // invoke-virtual {p0}, Lm/b/i/a;->getValue()Ljava/lang/String;
} // .end method
public java.lang.String getValue ( ) {
/* .locals 1 */
/* .line 2 */
v0 = this.c;
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
/* .line 1 */
v0 = this.b;
int v1 = 0; // const/4 v1, 0x0
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.String ) v0 ).hashCode ( ); // invoke-virtual {v0}, Ljava/lang/String;->hashCode()I
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* mul-int/lit8 v0, v0, 0x1f */
/* .line 2 */
v2 = this.c;
if ( v2 != null) { // if-eqz v2, :cond_1
v1 = (( java.lang.String ) v2 ).hashCode ( ); // invoke-virtual {v2}, Ljava/lang/String;->hashCode()I
} // :cond_1
/* add-int/2addr v0, v1 */
} // .end method
public java.lang.Object setValue ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .line 1 */
/* check-cast p1, Ljava/lang/String; */
(( m.b.i.a ) p0 ).b ( p1 ); // invoke-virtual {p0, p1}, Lm/b/i/a;->b(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String toString ( ) {
/* .locals 1 */
/* .line 1 */
(( m.b.i.a ) p0 ).a ( ); // invoke-virtual {p0}, Lm/b/i/a;->a()Ljava/lang/String;
} // .end method
