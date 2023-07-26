public class e.f.c.l.e.o.q3.i {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final e.f.c.n.a a;
	 /* # direct methods */
	 public static e.f.c.l.e.o.q3.i ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Le/f/c/n/h/f; */
		 /* invoke-direct {v0}, Le/f/c/n/h/f;-><init>()V */
		 v1 = e.f.c.l.e.o.u.a;
		 /* .line 2 */
		 (( e.f.c.n.h.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/n/h/f;->a(Le/f/c/n/g/a;)Le/f/c/n/h/f;
		 int v1 = 1; // const/4 v1, 0x1
		 /* .line 3 */
		 (( e.f.c.n.h.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/n/h/f;->a(Z)Le/f/c/n/h/f;
		 /* .line 4 */
		 (( e.f.c.n.h.f ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/n/h/f;->a()Le/f/c/n/a;
		 return;
	 } // .end method
	 public e.f.c.l.e.o.q3.i ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static e.f.c.l.e.o.h3 a ( android.util.JsonReader p0 ) { //synthethic
		 /* .locals 0 */
		 e.f.c.l.e.o.q3.i .k ( p0 );
	 } // .end method
	 public static e.f.c.l.e.o.p3 a ( android.util.JsonReader p0, Object p1 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "<T:", */
		 /* "Ljava/lang/Object;", */
		 /* ">(", */
		 /* "Landroid/util/JsonReader;", */
		 /* "Le/f/c/l/e/o/q3/h<", */
		 /* "TT;>;)", */
		 /* "Le/f/c/l/e/o/p3<", */
		 /* "TT;>;" */
		 /* } */
	 } // .end annotation
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 8 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 9 */
(( android.util.JsonReader ) p0 ).beginArray ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginArray()V
/* .line 10 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 11 */
/* .line 12 */
} // :cond_0
(( android.util.JsonReader ) p0 ).endArray ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endArray()V
/* .line 13 */
e.f.c.l.e.o.p3 .a ( v0 );
} // .end method
public static e.f.c.l.e.o.g2 b ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .u ( p0 );
} // .end method
public static e.f.c.l.e.o.d2 c ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .i ( p0 );
} // .end method
public static e.f.c.l.e.o.z2 d ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .t ( p0 );
} // .end method
public static e.f.c.l.e.o.q2 e ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .m ( p0 );
} // .end method
public static e.f.c.l.e.o.y2 f ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .q ( p0 );
} // .end method
public static e.f.c.l.e.o.y2 g ( android.util.JsonReader p0 ) { //synthethic
/* .locals 0 */
e.f.c.l.e.o.q3.i .q ( p0 );
} // .end method
public static e.f.c.l.e.o.k2 h ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.k2 .f ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "displayVersion"; // const-string v3, "displayVersion"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_1 */
final String v3 = "installationUuid"; // const-string v3, "installationUuid"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_2 */
final String v3 = "version"; // const-string v3, "version"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
	 int v2 = 1; // const/4 v2, 0x1
	 /* :sswitch_3 */
	 final String v3 = "identifier"; // const-string v3, "identifier"
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 int v2 = 0; // const/4 v2, 0x0
	 } // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
	 /* if-eq v2, v6, :cond_3 */
	 /* if-eq v2, v5, :cond_2 */
	 /* if-eq v2, v4, :cond_1 */
	 /* .line 6 */
	 (( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
	 /* .line 7 */
} // :cond_1
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->c(Ljava/lang/String;)Le/f/c/l/e/o/i2;
/* .line 8 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->a(Ljava/lang/String;)Le/f/c/l/e/o/i2;
/* .line 9 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->d(Ljava/lang/String;)Le/f/c/l/e/o/i2;
/* .line 10 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i2;->b(Ljava/lang/String;)Le/f/c/l/e/o/i2;
/* .line 11 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 12 */
(( e.f.c.l.e.o.i2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/i2;->a()Le/f/c/l/e/o/k2;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x60775357 -> :sswitch_3 */
/* 0x14f51cd8 -> :sswitch_2 */
/* 0x2ae81915 -> :sswitch_1 */
/* 0x75c19db6 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.d2 i ( android.util.JsonReader p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.d2 .c ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, 0x19e5f */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v3, v4, :cond_1 */
/* const v4, 0x6ac9171 */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "value"; // const-string v3, "value"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
final String v3 = "key"; // const-string v3, "key"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v5, :cond_3 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.c2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c2;->b(Ljava/lang/String;)Le/f/c/l/e/o/c2;
/* .line 8 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.c2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c2;->a(Ljava/lang/String;)Le/f/c/l/e/o/c2;
/* .line 9 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 10 */
(( e.f.c.l.e.o.c2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/c2;->a()Le/f/c/l/e/o/d2;
} // .end method
public static e.f.c.l.e.o.n2 j ( android.util.JsonReader p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.n2 .j ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "modelClass"; // const-string v3, "modelClass"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v2, 0x8 */
/* :sswitch_1 */
final String v3 = "state"; // const-string v3, "state"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 6; // const/4 v2, 0x6
/* :sswitch_2 */
final String v3 = "model"; // const-string v3, "model"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_3 */
final String v3 = "cores"; // const-string v3, "cores"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_4 */
final String v3 = "diskSpace"; // const-string v3, "diskSpace"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_5 */
final String v3 = "arch"; // const-string v3, "arch"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_6 */
final String v3 = "ram"; // const-string v3, "ram"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_7 */
final String v3 = "manufacturer"; // const-string v3, "manufacturer"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 7; // const/4 v2, 0x7
/* :sswitch_8 */
final String v3 = "simulator"; // const-string v3, "simulator"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 5; // const/4 v2, 0x5
} // :cond_0
} // :goto_1
/* packed-switch v2, :pswitch_data_0 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
/* :pswitch_0 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.m2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->c(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* .line 8 */
/* :pswitch_1 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.m2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->a(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 9 */
/* :pswitch_2 */
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.m2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->c(I)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 10 */
/* :pswitch_3 */
v1 = (( android.util.JsonReader ) p0 ).nextBoolean ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z
(( e.f.c.l.e.o.m2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->a(Z)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 11 */
/* :pswitch_4 */
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.m2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/m2;->a(J)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 12 */
/* :pswitch_5 */
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.m2 ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/m2;->b(J)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 13 */
/* :pswitch_6 */
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.m2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->b(I)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 14 */
/* :pswitch_7 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.m2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->b(Ljava/lang/String;)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 15 */
/* :pswitch_8 */
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.m2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/m2;->a(I)Le/f/c/l/e/o/m2;
/* goto/16 :goto_0 */
/* .line 16 */
} // :cond_1
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 17 */
(( e.f.c.l.e.o.m2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/m2;->a()Le/f/c/l/e/o/n2;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x7618bbfc -> :sswitch_8 */
/* -0x7561dc2f -> :sswitch_7 */
/* 0x1b81e -> :sswitch_6 */
/* 0x2dd056 -> :sswitch_5 */
/* 0x4dfed69 -> :sswitch_4 */
/* 0x5a744b4 -> :sswitch_3 */
/* 0x633fb29 -> :sswitch_2 */
/* 0x68ac491 -> :sswitch_1 */
/* 0x7bea4fcf -> :sswitch_0 */
} // .end sparse-switch
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static e.f.c.l.e.o.h3 k ( android.util.JsonReader p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.h3 .g ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 4; // const/4 v4, 0x4
int v5 = 3; // const/4 v5, 0x3
int v6 = 2; // const/4 v6, 0x2
int v7 = 1; // const/4 v7, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "timestamp"; // const-string v3, "timestamp"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_1 */
final String v3 = "type"; // const-string v3, "type"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_2 */
final String v3 = "log"; // const-string v3, "log"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_3 */
final String v3 = "app"; // const-string v3, "app"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_4 */
final String v3 = "device"; // const-string v3, "device"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-eq v2, v7, :cond_4 */
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
e.f.c.l.e.o.q3.i .r ( p0 );
(( e.f.c.l.e.o.c3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/g3;)Le/f/c/l/e/o/c3;
/* .line 8 */
} // :cond_2
e.f.c.l.e.o.q3.i .n ( p0 );
(( e.f.c.l.e.o.c3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/e3;)Le/f/c/l/e/o/c3;
/* .line 9 */
} // :cond_3
e.f.c.l.e.o.q3.i .l ( p0 );
(( e.f.c.l.e.o.c3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c3;->a(Le/f/c/l/e/o/b3;)Le/f/c/l/e/o/c3;
/* .line 10 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.c3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/c3;->a(Ljava/lang/String;)Le/f/c/l/e/o/c3;
/* .line 11 */
} // :cond_5
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.c3 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/c3;->a(J)Le/f/c/l/e/o/c3;
/* .line 12 */
} // :cond_6
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 13 */
(( e.f.c.l.e.o.c3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/c3;->a()Le/f/c/l/e/o/h3;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x4f94e1aa -> :sswitch_4 */
/* 0x17a21 -> :sswitch_3 */
/* 0x1a344 -> :sswitch_2 */
/* 0x368f3a -> :sswitch_1 */
/* 0x3492916 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.b3 l ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.b3 .f ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "uiOrientation"; // const-string v3, "uiOrientation"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_1 */
final String v3 = "customAttributes"; // const-string v3, "customAttributes"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_2 */
final String v3 = "execution"; // const-string v3, "execution"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_3 */
final String v3 = "background"; // const-string v3, "background"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
e.f.c.l.e.o.q3.c .a ( );
/* .line 8 */
e.f.c.l.e.o.q3.i .a ( p0,v1 );
/* .line 9 */
(( e.f.c.l.e.o.o2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/o2;
/* .line 10 */
} // :cond_2
e.f.c.l.e.o.q3.i .o ( p0 );
(( e.f.c.l.e.o.o2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/o2;->a(Le/f/c/l/e/o/a3;)Le/f/c/l/e/o/o2;
/* .line 11 */
} // :cond_3
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.o2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/o2;->a(I)Le/f/c/l/e/o/o2;
/* .line 12 */
} // :cond_4
v1 = (( android.util.JsonReader ) p0 ).nextBoolean ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z
java.lang.Boolean .valueOf ( v1 );
(( e.f.c.l.e.o.o2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/o2;->a(Ljava/lang/Boolean;)Le/f/c/l/e/o/o2;
/* .line 13 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 14 */
(( e.f.c.l.e.o.o2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/o2;->a()Le/f/c/l/e/o/b3;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x4f67aad2 -> :sswitch_3 */
/* -0x4106f4e8 -> :sswitch_2 */
/* 0x211737a8 -> :sswitch_1 */
/* 0x375b6a9c -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.q2 m ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.q2 .f ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 1; // const/4 v5, 0x1
int v6 = 2; // const/4 v6, 0x2
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "baseAddress"; // const-string v3, "baseAddress"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_1 */
final String v3 = "uuid"; // const-string v3, "uuid"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_2 */
final String v3 = "size"; // const-string v3, "size"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_3 */
final String v3 = "name"; // const-string v3, "name"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v5, :cond_3 */
/* if-eq v2, v6, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
android.util.Base64 .decode ( v1,v6 );
(( e.f.c.l.e.o.p2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->a([B)Le/f/c/l/e/o/p2;
/* .line 8 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.p2 ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->b(J)Le/f/c/l/e/o/p2;
/* .line 9 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.p2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/p2;->a(J)Le/f/c/l/e/o/p2;
/* .line 10 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.p2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/p2;->a(Ljava/lang/String;)Le/f/c/l/e/o/p2;
/* .line 11 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 12 */
(( e.f.c.l.e.o.p2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/p2;->a()Le/f/c/l/e/o/q2;
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x337a8b -> :sswitch_3 */
/* 0x35e001 -> :sswitch_2 */
/* 0x36f3bb -> :sswitch_1 */
/* 0x44c50fe3 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.e3 n ( android.util.JsonReader p0 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.e3 .g ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 5; // const/4 v4, 0x5
int v5 = 4; // const/4 v5, 0x4
int v6 = 3; // const/4 v6, 0x3
int v7 = 2; // const/4 v7, 0x2
int v8 = 1; // const/4 v8, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "proximityOn"; // const-string v3, "proximityOn"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_1 */
final String v3 = "ramUsed"; // const-string v3, "ramUsed"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 5; // const/4 v2, 0x5
/* :sswitch_2 */
final String v3 = "diskUsed"; // const-string v3, "diskUsed"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_3 */
final String v3 = "orientation"; // const-string v3, "orientation"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_4 */
final String v3 = "batteryVelocity"; // const-string v3, "batteryVelocity"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_5 */
final String v3 = "batteryLevel"; // const-string v3, "batteryLevel"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_6
/* if-eq v2, v8, :cond_5 */
/* if-eq v2, v7, :cond_4 */
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.d3 ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/d3;->b(J)Le/f/c/l/e/o/d3;
/* .line 8 */
} // :cond_2
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.d3 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/d3;->b(I)Le/f/c/l/e/o/d3;
/* .line 9 */
} // :cond_3
v1 = (( android.util.JsonReader ) p0 ).nextBoolean ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z
(( e.f.c.l.e.o.d3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/d3;->a(Z)Le/f/c/l/e/o/d3;
/* .line 10 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.d3 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/d3;->a(J)Le/f/c/l/e/o/d3;
/* goto/16 :goto_0 */
/* .line 11 */
} // :cond_5
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.d3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/d3;->a(I)Le/f/c/l/e/o/d3;
/* goto/16 :goto_0 */
/* .line 12 */
} // :cond_6
(( android.util.JsonReader ) p0 ).nextDouble ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextDouble()D
/* move-result-wide v1 */
java.lang.Double .valueOf ( v1,v2 );
(( e.f.c.l.e.o.d3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/d3;->a(Ljava/lang/Double;)Le/f/c/l/e/o/d3;
/* goto/16 :goto_0 */
/* .line 13 */
} // :cond_7
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 14 */
(( e.f.c.l.e.o.d3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/d3;->a()Le/f/c/l/e/o/e3;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x65d74289 -> :sswitch_5 */
/* -0x56c20df6 -> :sswitch_4 */
/* -0x55cd0a30 -> :sswitch_3 */
/* 0x10ad56fa -> :sswitch_2 */
/* 0x3a34d8fb -> :sswitch_1 */
/* 0x5a6876be -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.a3 o ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.a3 .e ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "exception"; // const-string v3, "exception"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_1 */
final String v3 = "binaries"; // const-string v3, "binaries"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_2 */
final String v3 = "signal"; // const-string v3, "signal"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_3 */
final String v3 = "threads"; // const-string v3, "threads"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
e.f.c.l.e.o.q3.e .a ( );
/* .line 8 */
e.f.c.l.e.o.q3.i .a ( p0,v1 );
/* .line 9 */
(( e.f.c.l.e.o.r2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
/* .line 10 */
} // :cond_2
e.f.c.l.e.o.q3.i .s ( p0 );
(( e.f.c.l.e.o.r2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/v2;)Le/f/c/l/e/o/r2;
/* .line 11 */
} // :cond_3
e.f.c.l.e.o.q3.i .p ( p0 );
(( e.f.c.l.e.o.r2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/r2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/r2;
/* .line 12 */
} // :cond_4
e.f.c.l.e.o.q3.d .a ( );
/* .line 13 */
e.f.c.l.e.o.q3.i .a ( p0,v1 );
/* .line 14 */
(( e.f.c.l.e.o.r2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/r2;->b(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/r2;
/* .line 15 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 16 */
(( e.f.c.l.e.o.r2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/r2;->a()Le/f/c/l/e/o/a3;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x4fbf4c57 -> :sswitch_3 */
/* -0x35ca9158 -> :sswitch_2 */
/* 0x37e2e05f -> :sswitch_1 */
/* 0x584fd04f -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.t2 p ( android.util.JsonReader p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.t2 .f ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 4; // const/4 v4, 0x4
int v5 = 3; // const/4 v5, 0x3
int v6 = 2; // const/4 v6, 0x2
int v7 = 1; // const/4 v7, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "overflowCount"; // const-string v3, "overflowCount"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_1 */
final String v3 = "causedBy"; // const-string v3, "causedBy"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_2 */
final String v3 = "type"; // const-string v3, "type"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_3 */
final String v3 = "reason"; // const-string v3, "reason"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_4 */
final String v3 = "frames"; // const-string v3, "frames"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-eq v2, v7, :cond_4 */
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.s2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/s2;->a(Ljava/lang/String;)Le/f/c/l/e/o/s2;
/* .line 8 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.s2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/s2;->b(Ljava/lang/String;)Le/f/c/l/e/o/s2;
/* .line 9 */
} // :cond_3
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.s2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/s2;->a(I)Le/f/c/l/e/o/s2;
/* .line 10 */
} // :cond_4
e.f.c.l.e.o.q3.f .a ( );
/* .line 11 */
e.f.c.l.e.o.q3.i .a ( p0,v1 );
/* .line 12 */
(( e.f.c.l.e.o.s2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/s2;
/* .line 13 */
} // :cond_5
e.f.c.l.e.o.q3.i .p ( p0 );
(( e.f.c.l.e.o.s2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/s2;->a(Le/f/c/l/e/o/t2;)Le/f/c/l/e/o/s2;
/* goto/16 :goto_0 */
/* .line 14 */
} // :cond_6
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 15 */
(( e.f.c.l.e.o.s2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/s2;->a()Le/f/c/l/e/o/t2;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x4b7d7b5a -> :sswitch_4 */
/* -0x37ba6dbc -> :sswitch_3 */
/* 0x368f3a -> :sswitch_2 */
/* 0x57bc6d2 -> :sswitch_1 */
/* 0x22acde2d -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.y2 q ( android.util.JsonReader p0 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.y2 .f ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_6
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 4; // const/4 v4, 0x4
int v5 = 3; // const/4 v5, 0x3
int v6 = 2; // const/4 v6, 0x2
int v7 = 1; // const/4 v7, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "importance"; // const-string v3, "importance"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_1 */
final String v3 = "file"; // const-string v3, "file"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_2 */
final String v3 = "pc"; // const-string v3, "pc"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_3 */
final String v3 = "symbol"; // const-string v3, "symbol"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_4 */
final String v3 = "offset"; // const-string v3, "offset"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* if-eq v2, v7, :cond_4 */
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.x2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/x2;->b(Ljava/lang/String;)Le/f/c/l/e/o/x2;
/* .line 8 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.x2 ) v0 ).b ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/x2;->b(J)Le/f/c/l/e/o/x2;
/* .line 9 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.x2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/x2;->a(J)Le/f/c/l/e/o/x2;
/* .line 10 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.x2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/x2;->a(Ljava/lang/String;)Le/f/c/l/e/o/x2;
/* .line 11 */
} // :cond_5
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.x2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/x2;->a(I)Le/f/c/l/e/o/x2;
/* .line 12 */
} // :cond_6
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 13 */
(( e.f.c.l.e.o.x2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/x2;->a()Le/f/c/l/e/o/y2;
/* nop */
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x3cc89b6d -> :sswitch_4 */
/* -0x34e68a68 -> :sswitch_3 */
/* 0xdf3 -> :sswitch_2 */
/* 0x2ff57c -> :sswitch_1 */
/* 0x7eb2da74 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.g3 r ( android.util.JsonReader p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.g3 .b ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, 0x38b73479 */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "content"; // const-string v3, "content"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.f3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/f3;->a(Ljava/lang/String;)Le/f/c/l/e/o/f3;
/* .line 8 */
} // :cond_3
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 9 */
(( e.f.c.l.e.o.f3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/f3;->a()Le/f/c/l/e/o/g3;
} // .end method
public static e.f.c.l.e.o.v2 s ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.v2 .d ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, -0x4468640c */
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* if-eq v3, v4, :cond_2 */
/* const v4, 0x2eaded */
/* if-eq v3, v4, :cond_1 */
/* const v4, 0x337a8b */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "name"; // const-string v3, "name"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
final String v3 = "code"; // const-string v3, "code"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
final String v3 = "address"; // const-string v3, "address"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 2; // const/4 v2, 0x2
} // :cond_3
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_6
/* if-eq v2, v6, :cond_5 */
/* if-eq v2, v5, :cond_4 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.u2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/u2;->a(J)Le/f/c/l/e/o/u2;
/* .line 8 */
} // :cond_5
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.u2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->a(Ljava/lang/String;)Le/f/c/l/e/o/u2;
/* .line 9 */
} // :cond_6
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.u2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/u2;->b(Ljava/lang/String;)Le/f/c/l/e/o/u2;
/* .line 10 */
} // :cond_7
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 11 */
(( e.f.c.l.e.o.u2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/u2;->a()Le/f/c/l/e/o/v2;
} // .end method
public static e.f.c.l.e.o.z2 t ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.z2 .d ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, -0x4b7d7b5a */
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* if-eq v3, v4, :cond_2 */
/* const v4, 0x337a8b */
/* if-eq v3, v4, :cond_1 */
/* const v4, 0x7eb2da74 */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "importance"; // const-string v3, "importance"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
final String v3 = "name"; // const-string v3, "name"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 1; // const/4 v2, 0x1
} // :cond_2
final String v3 = "frames"; // const-string v3, "frames"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
int v2 = 2; // const/4 v2, 0x2
} // :cond_3
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_6
/* if-eq v2, v6, :cond_5 */
/* if-eq v2, v5, :cond_4 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_4
e.f.c.l.e.o.q3.g .a ( );
/* .line 8 */
e.f.c.l.e.o.q3.i .a ( p0,v1 );
/* .line 9 */
(( e.f.c.l.e.o.w2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/w2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/w2;
/* .line 10 */
} // :cond_5
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.w2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/w2;->a(Ljava/lang/String;)Le/f/c/l/e/o/w2;
/* .line 11 */
} // :cond_6
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.w2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/w2;->a(I)Le/f/c/l/e/o/w2;
/* .line 12 */
} // :cond_7
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 13 */
(( e.f.c.l.e.o.w2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/w2;->a()Le/f/c/l/e/o/z2;
} // .end method
public static e.f.c.l.e.o.g2 u ( android.util.JsonReader p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.g2 .c ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, -0x2bcbadf9 */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v3, v4, :cond_1 */
/* const v4, -0x21d0a4e6 */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "contents"; // const-string v3, "contents"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
final String v3 = "filename"; // const-string v3, "filename"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v5, :cond_3 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
int v2 = 2; // const/4 v2, 0x2
android.util.Base64 .decode ( v1,v2 );
(( e.f.c.l.e.o.f2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/f2;->a([B)Le/f/c/l/e/o/f2;
/* .line 8 */
} // :cond_4
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.f2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/f2;->a(Ljava/lang/String;)Le/f/c/l/e/o/f2;
/* .line 9 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 10 */
(( e.f.c.l.e.o.f2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/f2;->a()Le/f/c/l/e/o/g2;
} // .end method
public static e.f.c.l.e.o.h2 v ( android.util.JsonReader p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.h2 .c ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, 0x5ceba77 */
int v5 = 1; // const/4 v5, 0x1
/* if-eq v3, v4, :cond_1 */
/* const v4, 0x6518f1f */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "orgId"; // const-string v3, "orgId"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 1; // const/4 v2, 0x1
} // :cond_1
final String v3 = "files"; // const-string v3, "files"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
int v2 = 0; // const/4 v2, 0x0
} // :cond_2
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v5, :cond_3 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.e2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/e2;->a(Ljava/lang/String;)Le/f/c/l/e/o/e2;
/* .line 8 */
} // :cond_4
e.f.c.l.e.o.q3.b .a ( );
e.f.c.l.e.o.q3.i .a ( p0,v1 );
(( e.f.c.l.e.o.e2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/e2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/e2;
/* .line 9 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 10 */
(( e.f.c.l.e.o.e2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/e2;->a()Le/f/c/l/e/o/h2;
} // .end method
public static e.f.c.l.e.o.j3 w ( android.util.JsonReader p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.j3 .e ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 3; // const/4 v4, 0x3
int v5 = 2; // const/4 v5, 0x2
int v6 = 1; // const/4 v6, 0x1
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "platform"; // const-string v3, "platform"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_1 */
final String v3 = "version"; // const-string v3, "version"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_2 */
final String v3 = "jailbroken"; // const-string v3, "jailbroken"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_3 */
final String v3 = "buildVersion"; // const-string v3, "buildVersion"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_4
/* if-eq v2, v6, :cond_3 */
/* if-eq v2, v5, :cond_2 */
/* if-eq v2, v4, :cond_1 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_1
v1 = (( android.util.JsonReader ) p0 ).nextBoolean ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Z)Le/f/c/l/e/o/i3;
/* .line 8 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(Ljava/lang/String;)Le/f/c/l/e/o/i3;
/* .line 9 */
} // :cond_3
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.i3 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->b(Ljava/lang/String;)Le/f/c/l/e/o/i3;
/* .line 10 */
} // :cond_4
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.i3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/i3;->a(I)Le/f/c/l/e/o/i3;
/* .line 11 */
} // :cond_5
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 12 */
(( e.f.c.l.e.o.i3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/i3;->a()Le/f/c/l/e/o/j3;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x36578976 -> :sswitch_3 */
/* -0x11773b11 -> :sswitch_2 */
/* 0x14f51cd8 -> :sswitch_1 */
/* 0x6fbd6873 -> :sswitch_0 */
} // .end sparse-switch
} // .end method
public static e.f.c.l.e.o.o3 x ( android.util.JsonReader p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.o3 .l ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* sparse-switch v3, :sswitch_data_0 */
/* :sswitch_0 */
final String v3 = "session"; // const-string v3, "session"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 6; // const/4 v2, 0x6
/* :sswitch_1 */
final String v3 = "displayVersion"; // const-string v3, "displayVersion"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 5; // const/4 v2, 0x5
/* :sswitch_2 */
final String v3 = "platform"; // const-string v3, "platform"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
/* :sswitch_3 */
final String v3 = "installationUuid"; // const-string v3, "installationUuid"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_4 */
final String v3 = "gmpAppId"; // const-string v3, "gmpAppId"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_5 */
final String v3 = "buildVersion"; // const-string v3, "buildVersion"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_6 */
final String v3 = "sdkVersion"; // const-string v3, "sdkVersion"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_7 */
final String v3 = "ndkPayload"; // const-string v3, "ndkPayload"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 7; // const/4 v2, 0x7
} // :cond_0
} // :goto_1
/* packed-switch v2, :pswitch_data_0 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
/* :pswitch_0 */
e.f.c.l.e.o.q3.i .v ( p0 );
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/h2;)Le/f/c/l/e/o/b2;
/* .line 8 */
/* :pswitch_1 */
e.f.c.l.e.o.q3.i .y ( p0 );
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Le/f/c/l/e/o/m3;)Le/f/c/l/e/o/b2;
/* .line 9 */
/* :pswitch_2 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->b(Ljava/lang/String;)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 10 */
/* :pswitch_3 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(Ljava/lang/String;)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 11 */
/* :pswitch_4 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).d ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->d(Ljava/lang/String;)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 12 */
/* :pswitch_5 */
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.b2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->a(I)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 13 */
/* :pswitch_6 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).c ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->c(Ljava/lang/String;)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 14 */
/* :pswitch_7 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.b2 ) v0 ).e ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/b2;->e(Ljava/lang/String;)Le/f/c/l/e/o/b2;
/* goto/16 :goto_0 */
/* .line 15 */
} // :cond_1
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 16 */
(( e.f.c.l.e.o.b2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/b2;->a()Le/f/c/l/e/o/o3;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x7e43cda7 -> :sswitch_7 */
/* -0x74fb5cc2 -> :sswitch_6 */
/* -0x36578976 -> :sswitch_5 */
/* 0x14879cf2 -> :sswitch_4 */
/* 0x2ae81915 -> :sswitch_3 */
/* 0x6fbd6873 -> :sswitch_2 */
/* 0x75c19db6 -> :sswitch_1 */
/* 0x76508296 -> :sswitch_0 */
} // .end sparse-switch
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static e.f.c.l.e.o.m3 y ( android.util.JsonReader p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.m3 .n ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
int v4 = 2; // const/4 v4, 0x2
/* sparse-switch v3, :sswitch_data_0 */
/* goto/16 :goto_1 */
/* :sswitch_0 */
final String v3 = "generatorType"; // const-string v3, "generatorType"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v2, 0xa */
/* goto/16 :goto_1 */
/* :sswitch_1 */
final String v3 = "crashed"; // const-string v3, "crashed"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 4; // const/4 v2, 0x4
/* :sswitch_2 */
final String v3 = "generator"; // const-string v3, "generator"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 0; // const/4 v2, 0x0
/* :sswitch_3 */
final String v3 = "user"; // const-string v3, "user"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 5; // const/4 v2, 0x5
/* :sswitch_4 */
final String v3 = "app"; // const-string v3, "app"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 6; // const/4 v2, 0x6
/* :sswitch_5 */
final String v3 = "os"; // const-string v3, "os"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 7; // const/4 v2, 0x7
/* :sswitch_6 */
final String v3 = "events"; // const-string v3, "events"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v2, 0x9 */
/* :sswitch_7 */
final String v3 = "device"; // const-string v3, "device"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/16 v2, 0x8 */
/* :sswitch_8 */
final String v3 = "endedAt"; // const-string v3, "endedAt"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 3; // const/4 v2, 0x3
/* :sswitch_9 */
final String v3 = "identifier"; // const-string v3, "identifier"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 1; // const/4 v2, 0x1
/* :sswitch_a */
final String v3 = "startedAt"; // const-string v3, "startedAt"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v2 = 2; // const/4 v2, 0x2
} // :cond_0
} // :goto_1
/* packed-switch v2, :pswitch_data_0 */
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* goto/16 :goto_0 */
/* .line 7 */
/* :pswitch_0 */
v1 = (( android.util.JsonReader ) p0 ).nextInt ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextInt()I
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(I)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 8 */
/* :pswitch_1 */
e.f.c.l.e.o.q3.a .a ( );
e.f.c.l.e.o.q3.i .a ( p0,v1 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/p3;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 9 */
/* :pswitch_2 */
e.f.c.l.e.o.q3.i .j ( p0 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/n2;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 10 */
/* :pswitch_3 */
e.f.c.l.e.o.q3.i .w ( p0 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/j3;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 11 */
/* :pswitch_4 */
e.f.c.l.e.o.q3.i .h ( p0 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/k2;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 12 */
/* :pswitch_5 */
e.f.c.l.e.o.q3.i .z ( p0 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Le/f/c/l/e/o/l3;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 13 */
/* :pswitch_6 */
v1 = (( android.util.JsonReader ) p0 ).nextBoolean ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextBoolean()Z
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Z)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 14 */
/* :pswitch_7 */
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Ljava/lang/Long;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 15 */
/* :pswitch_8 */
(( android.util.JsonReader ) p0 ).nextLong ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextLong()J
/* move-result-wide v1 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Le/f/c/l/e/o/l2;->a(J)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 16 */
/* :pswitch_9 */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
android.util.Base64 .decode ( v1,v4 );
/* .line 17 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a([B)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 18 */
/* :pswitch_a */
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.l2 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/l2;->a(Ljava/lang/String;)Le/f/c/l/e/o/l2;
/* goto/16 :goto_0 */
/* .line 19 */
} // :cond_1
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 20 */
(( e.f.c.l.e.o.l2 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/l2;->a()Le/f/c/l/e/o/m3;
/* :sswitch_data_0 */
/* .sparse-switch */
/* -0x7ee2d36c -> :sswitch_a */
/* -0x60775357 -> :sswitch_9 */
/* -0x5fc4f373 -> :sswitch_8 */
/* -0x4f94e1aa -> :sswitch_7 */
/* -0x4cf81ee7 -> :sswitch_6 */
/* 0xde4 -> :sswitch_5 */
/* 0x17a21 -> :sswitch_4 */
/* 0x36ebcb -> :sswitch_3 */
/* 0x111a9ad3 -> :sswitch_2 */
/* 0x3d1e2286 -> :sswitch_1 */
/* 0x7a02fcad -> :sswitch_0 */
} // .end sparse-switch
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_a */
/* :pswitch_9 */
/* :pswitch_8 */
/* :pswitch_7 */
/* :pswitch_6 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static e.f.c.l.e.o.l3 z ( android.util.JsonReader p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
e.f.c.l.e.o.l3 .b ( );
/* .line 2 */
(( android.util.JsonReader ) p0 ).beginObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->beginObject()V
/* .line 3 */
} // :goto_0
v1 = (( android.util.JsonReader ) p0 ).hasNext ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->hasNext()Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 4 */
(( android.util.JsonReader ) p0 ).nextName ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextName()Ljava/lang/String;
int v2 = -1; // const/4 v2, -0x1
/* .line 5 */
v3 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const v4, -0x60775357 */
/* if-eq v3, v4, :cond_0 */
} // :cond_0
final String v3 = "identifier"; // const-string v3, "identifier"
v1 = (( java.lang.String ) v1 ).equals ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v2 = 0; // const/4 v2, 0x0
} // :cond_1
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 6 */
(( android.util.JsonReader ) p0 ).skipValue ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->skipValue()V
/* .line 7 */
} // :cond_2
(( android.util.JsonReader ) p0 ).nextString ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->nextString()Ljava/lang/String;
(( e.f.c.l.e.o.k3 ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Le/f/c/l/e/o/k3;->a(Ljava/lang/String;)Le/f/c/l/e/o/k3;
/* .line 8 */
} // :cond_3
(( android.util.JsonReader ) p0 ).endObject ( ); // invoke-virtual {p0}, Landroid/util/JsonReader;->endObject()V
/* .line 9 */
(( e.f.c.l.e.o.k3 ) v0 ).a ( ); // invoke-virtual {v0}, Le/f/c/l/e/o/k3;->a()Le/f/c/l/e/o/l3;
} // .end method
/* # virtual methods */
public e.f.c.l.e.o.h3 a ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 3 */
try { // :try_start_0
/* new-instance v0, Landroid/util/JsonReader; */
/* new-instance v1, Ljava/io/StringReader; */
/* invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 4 */
try { // :try_start_1
e.f.c.l.e.o.q3.i .k ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 5 */
try { // :try_start_2
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_2 ..:try_end_2} :catch_0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 6 */
try { // :try_start_3
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catchall_1 */
try { // :try_start_4
/* throw p1 */
/* :try_end_4 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 7 */
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
public java.lang.String a ( e.f.c.l.e.o.h3 p0 ) {
/* .locals 1 */
/* .line 2 */
v0 = e.f.c.l.e.o.q3.i.a;
} // .end method
public java.lang.String a ( e.f.c.l.e.o.o3 p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = e.f.c.l.e.o.q3.i.a;
} // .end method
public e.f.c.l.e.o.o3 b ( java.lang.String p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
try { // :try_start_0
/* new-instance v0, Landroid/util/JsonReader; */
/* new-instance v1, Ljava/io/StringReader; */
/* invoke-direct {v1, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Landroid/util/JsonReader;-><init>(Ljava/io/Reader;)V */
/* :try_end_0 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 2 */
try { // :try_start_1
e.f.c.l.e.o.q3.i .x ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 3 */
try { // :try_start_2
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_2 ..:try_end_2} :catch_0 */
/* :catchall_0 */
/* move-exception p1 */
/* .line 4 */
try { // :try_start_3
(( android.util.JsonReader ) v0 ).close ( ); // invoke-virtual {v0}, Landroid/util/JsonReader;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* :catchall_1 */
try { // :try_start_4
/* throw p1 */
/* :try_end_4 */
/* .catch Ljava/lang/IllegalStateException; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* move-exception p1 */
/* .line 5 */
/* new-instance v0, Ljava/io/IOException; */
/* invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V */
/* throw v0 */
} // .end method
