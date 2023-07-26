public abstract class c.h.f.i.i {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.content.res.TypedArray p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* const/16 v1, 0x15 */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 5 */
		 p0 = 		 (( android.content.res.TypedArray ) p0 ).getType ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getType(I)I
		 /* .line 6 */
	 } // :cond_0
	 /* new-instance v0, Landroid/util/TypedValue; */
	 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
	 /* .line 7 */
	 (( android.content.res.TypedArray ) p0 ).getValue ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
	 /* .line 8 */
	 /* iget p0, v0, Landroid/util/TypedValue;->type:I */
} // .end method
public static c.h.f.i.e a ( org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1 ) {
	 /* .locals 3 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Lorg/xmlpull/v1/XmlPullParserException;, */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .line 1 */
v0 = } // :goto_0
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_0 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v2, :cond_0 */
} // :cond_0
/* if-ne v0, v1, :cond_1 */
/* .line 2 */
c.h.f.i.i .b ( p0,p1 );
/* .line 3 */
} // :cond_1
/* new-instance p0, Lorg/xmlpull/v1/XmlPullParserException; */
final String p1 = "No start tag found"; // const-string p1, "No start tag found"
/* invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static java.util.List a ( android.content.res.Resources p0, Integer p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/res/Resources;", */
/* "I)", */
/* "Ljava/util/List<", */
/* "Ljava/util/List<", */
/* "[B>;>;" */
/* } */
} // .end annotation
/* if-nez p1, :cond_0 */
/* .line 9 */
java.util.Collections .emptyList ( );
/* .line 10 */
} // :cond_0
(( android.content.res.Resources ) p0 ).obtainTypedArray ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;
/* .line 11 */
try { // :try_start_0
v1 = (( android.content.res.TypedArray ) v0 ).length ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I
/* if-nez v1, :cond_1 */
/* .line 12 */
java.util.Collections .emptyList ( );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 13 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 14 */
} // :cond_1
try { // :try_start_1
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
v3 = c.h.f.i.i .a ( v0,v2 );
int v4 = 1; // const/4 v4, 0x1
/* if-ne v3, v4, :cond_3 */
int p1 = 0; // const/4 p1, 0x0
/* .line 16 */
} // :goto_0
v3 = (( android.content.res.TypedArray ) v0 ).length ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->length()I
/* if-ge p1, v3, :cond_4 */
/* .line 17 */
v3 = (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, v2 ); // invoke-virtual {v0, p1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 18 */
(( android.content.res.Resources ) p0 ).getStringArray ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
c.h.f.i.i .a ( v3 );
} // :cond_2
/* add-int/lit8 p1, p1, 0x1 */
/* .line 19 */
} // :cond_3
(( android.content.res.Resources ) p0 ).getStringArray ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
c.h.f.i.i .a ( p0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 20 */
} // :cond_4
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* :catchall_0 */
/* move-exception p0 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
/* .line 21 */
/* throw p0 */
} // .end method
public static java.util.List a ( java.lang.String[] p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "([", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List<", */
/* "[B>;" */
/* } */
} // .end annotation
/* .line 22 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 23 */
/* array-length v1, p0 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
} // :goto_0
/* if-ge v3, v1, :cond_0 */
/* aget-object v4, p0, v3 */
/* .line 24 */
android.util.Base64 .decode ( v4,v2 );
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_0
} // .end method
public static void a ( org.xmlpull.v1.XmlPullParser p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* if-lez v0, :cond_2 */
v1 = /* .line 25 */
int v2 = 2; // const/4 v2, 0x2
/* if-eq v1, v2, :cond_1 */
int v2 = 3; // const/4 v2, 0x3
/* if-eq v1, v2, :cond_0 */
} // :cond_0
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
return;
} // .end method
public static c.h.f.i.e b ( org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
final String v0 = "font-family"; // const-string v0, "font-family"
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* .line 1 */
/* .line 2 */
/* .line 3 */
v0 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
c.h.f.i.i .c ( p0,p1 );
/* .line 5 */
} // :cond_0
c.h.f.i.i .a ( p0 );
} // .end method
public static c.h.f.i.e c ( org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
android.util.Xml .asAttributeSet ( p0 );
/* .line 2 */
v1 = c.h.d.FontFamily;
(( android.content.res.Resources ) p1 ).obtainAttributes ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 3 */
(( android.content.res.TypedArray ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 4 */
(( android.content.res.TypedArray ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 5 */
(( android.content.res.TypedArray ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 6 */
int v5 = 0; // const/4 v5, 0x0
v4 = (( android.content.res.TypedArray ) v0 ).getResourceId ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 7 */
int v6 = 1; // const/4 v6, 0x1
v5 = (( android.content.res.TypedArray ) v0 ).getInteger ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInteger(II)I
/* .line 8 */
/* const/16 v7, 0x1f4 */
v6 = (( android.content.res.TypedArray ) v0 ).getInteger ( v6, v7 ); // invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInteger(II)I
/* .line 9 */
/* .line 10 */
(( android.content.res.TypedArray ) v0 ).getString ( v7 ); // invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 11 */
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
int v0 = 3; // const/4 v0, 0x3
if ( v1 != null) { // if-eqz v1, :cond_1
if ( v2 != null) { // if-eqz v2, :cond_1
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 12 */
v8 = } // :goto_0
/* if-eq v8, v0, :cond_0 */
/* .line 13 */
c.h.f.i.i .a ( p0 );
/* .line 14 */
} // :cond_0
c.h.f.i.i .a ( p1,v4 );
/* .line 15 */
/* new-instance p1, Lc/h/f/i/h; */
/* new-instance v0, Lc/h/k/g; */
/* invoke-direct {v0, v1, v2, v3, p0}, Lc/h/k/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V */
/* invoke-direct {p1, v0, v5, v6, v7}, Lc/h/f/i/h;-><init>(Lc/h/k/g;IILjava/lang/String;)V */
/* .line 16 */
} // :cond_1
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* .line 17 */
v2 = } // :goto_1
/* if-eq v2, v0, :cond_4 */
v2 = /* .line 18 */
int v3 = 2; // const/4 v3, 0x2
/* if-eq v2, v3, :cond_2 */
/* .line 19 */
} // :cond_2
final String v3 = "font"; // const-string v3, "font"
/* .line 20 */
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 21 */
c.h.f.i.i .d ( p0,p1 );
/* .line 22 */
} // :cond_3
c.h.f.i.i .a ( p0 );
/* .line 23 */
p0 = } // :cond_4
if ( p0 != null) { // if-eqz p0, :cond_5
int p0 = 0; // const/4 p0, 0x0
/* .line 24 */
} // :cond_5
/* new-instance p0, Lc/h/f/i/f; */
p1 = /* .line 25 */
/* new-array p1, p1, [Lc/h/f/i/g; */
/* .line 26 */
/* check-cast p1, [Lc/h/f/i/g; */
/* invoke-direct {p0, p1}, Lc/h/f/i/f;-><init>([Lc/h/f/i/g;)V */
} // .end method
public static c.h.f.i.g d ( org.xmlpull.v1.XmlPullParser p0, android.content.res.Resources p1 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xmlpull/v1/XmlPullParserException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .line 1 */
android.util.Xml .asAttributeSet ( p0 );
/* .line 2 */
v1 = c.h.d.FontFamilyFont;
(( android.content.res.Resources ) p1 ).obtainAttributes ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
/* .line 3 */
v0 = (( android.content.res.TypedArray ) p1 ).hasValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
/* .line 5 */
} // :cond_0
} // :goto_0
/* const/16 v1, 0x190 */
/* .line 6 */
v4 = (( android.content.res.TypedArray ) p1 ).getInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
/* .line 7 */
v0 = (( android.content.res.TypedArray ) p1 ).hasValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 8 */
/* .line 9 */
} // :cond_1
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
/* .line 10 */
v0 = (( android.content.res.TypedArray ) p1 ).getInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
int v2 = 1; // const/4 v2, 0x1
/* if-ne v2, v0, :cond_2 */
int v5 = 1; // const/4 v5, 0x1
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 11 */
} // :goto_2
v0 = (( android.content.res.TypedArray ) p1 ).hasValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 12 */
/* .line 13 */
} // :cond_3
/* .line 14 */
} // :goto_3
v2 = (( android.content.res.TypedArray ) p1 ).hasValue ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 15 */
/* .line 16 */
} // :cond_4
/* .line 17 */
} // :goto_4
(( android.content.res.TypedArray ) p1 ).getString ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 18 */
v7 = (( android.content.res.TypedArray ) p1 ).getInt ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I
/* .line 19 */
v0 = (( android.content.res.TypedArray ) p1 ).hasValue ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 20 */
/* .line 21 */
} // :cond_5
/* .line 22 */
} // :goto_5
v8 = (( android.content.res.TypedArray ) p1 ).getResourceId ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 23 */
(( android.content.res.TypedArray ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* .line 24 */
(( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
/* .line 25 */
p1 = } // :goto_6
int v0 = 3; // const/4 v0, 0x3
/* if-eq p1, v0, :cond_6 */
/* .line 26 */
c.h.f.i.i .a ( p0 );
/* .line 27 */
} // :cond_6
/* new-instance p0, Lc/h/f/i/g; */
/* move-object v2, p0 */
/* invoke-direct/range {v2 ..v8}, Lc/h/f/i/g;-><init>(Ljava/lang/String;IZLjava/lang/String;II)V */
} // .end method
