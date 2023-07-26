public abstract class c.h.f.i.t {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Float a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3, Float p4 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 p1 = 		 c.h.f.i.t .a ( p1,p2 );
		 /* if-nez p1, :cond_0 */
		 /* .line 3 */
	 } // :cond_0
	 p0 = 	 (( android.content.res.TypedArray ) p0 ).getFloat ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getFloat(IF)F
} // .end method
public static Integer a ( android.content.Context p0, Integer p1, Integer p2 ) {
	 /* .locals 2 */
	 /* .line 37 */
	 /* new-instance v0, Landroid/util/TypedValue; */
	 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
	 /* .line 38 */
	 (( android.content.Context ) p0 ).getTheme ( ); // invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
	 int v1 = 1; // const/4 v1, 0x1
	 (( android.content.res.Resources$Theme ) p0 ).resolveAttribute ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
	 /* .line 39 */
	 /* iget p0, v0, Landroid/util/TypedValue;->resourceId:I */
	 if ( p0 != null) { // if-eqz p0, :cond_0
	 } // :cond_0
} // .end method
public static Integer a ( android.content.res.TypedArray p0, Integer p1, Integer p2, Integer p3 ) {
	 /* .locals 0 */
	 /* .line 35 */
	 p2 = 	 (( android.content.res.TypedArray ) p0 ).getInt ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I
	 /* .line 36 */
	 p0 = 	 (( android.content.res.TypedArray ) p0 ).getInt ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I
} // .end method
public static Integer a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3, Integer p4 ) {
	 /* .locals 0 */
	 /* .line 6 */
	 p1 = 	 c.h.f.i.t .a ( p1,p2 );
	 /* if-nez p1, :cond_0 */
	 /* .line 7 */
} // :cond_0
p0 = (( android.content.res.TypedArray ) p0 ).getColor ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getColor(II)I
} // .end method
public static android.content.res.ColorStateList a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources$Theme p2, java.lang.String p3, Integer p4 ) {
/* .locals 1 */
/* .line 17 */
p1 = c.h.f.i.t .a ( p1,p3 );
if ( p1 != null) { // if-eqz p1, :cond_2
	 /* .line 18 */
	 /* new-instance p1, Landroid/util/TypedValue; */
	 /* invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V */
	 /* .line 19 */
	 (( android.content.res.TypedArray ) p0 ).getValue ( p4, p1 ); // invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
	 /* .line 20 */
	 /* iget p3, p1, Landroid/util/TypedValue;->type:I */
	 int v0 = 2; // const/4 v0, 0x2
	 /* if-eq p3, v0, :cond_1 */
	 /* const/16 v0, 0x1c */
	 /* if-lt p3, v0, :cond_0 */
	 /* const/16 v0, 0x1f */
	 /* if-gt p3, v0, :cond_0 */
	 /* .line 21 */
	 c.h.f.i.t .a ( p1 );
	 /* .line 22 */
} // :cond_0
(( android.content.res.TypedArray ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;
int p3 = 0; // const/4 p3, 0x0
/* .line 23 */
p0 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p4, p3 ); // invoke-virtual {p0, p4, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 24 */
c.h.f.i.c .a ( p1,p0,p2 );
/* .line 25 */
} // :cond_1
/* new-instance p0, Ljava/lang/UnsupportedOperationException; */
/* new-instance p2, Ljava/lang/StringBuilder; */
/* invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V */
final String p3 = "Failed to resolve attribute at index "; // const-string p3, "Failed to resolve attribute at index "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p4 ); // invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String p3 = ": "; // const-string p3, ": "
(( java.lang.StringBuilder ) p2 ).append ( p3 ); // invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).append ( p1 ); // invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p2 ).toString ( ); // invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static android.content.res.ColorStateList a ( android.util.TypedValue p0 ) {
/* .locals 0 */
/* .line 26 */
/* iget p0, p0, Landroid/util/TypedValue;->data:I */
android.content.res.ColorStateList .valueOf ( p0 );
} // .end method
public static android.content.res.TypedArray a ( android.content.res.Resources p0, android.content.res.Resources$Theme p1, android.util.AttributeSet p2, Integer[] p3 ) {
/* .locals 0 */
/* if-nez p1, :cond_0 */
/* .line 29 */
(( android.content.res.Resources ) p0 ).obtainAttributes ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
/* .line 30 */
(( android.content.res.Resources$Theme ) p1 ).obtainStyledAttributes ( p2, p3, p0, p0 ); // invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
} // .end method
public static android.graphics.drawable.Drawable a ( android.content.res.TypedArray p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 33 */
(( android.content.res.TypedArray ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* if-nez p1, :cond_0 */
/* .line 34 */
(( android.content.res.TypedArray ) p0 ).getDrawable ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
} // :cond_0
} // .end method
public static c.h.f.i.d a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, android.content.res.Resources$Theme p2, java.lang.String p3, Integer p4, Integer p5 ) {
/* .locals 1 */
/* .line 8 */
p1 = c.h.f.i.t .a ( p1,p3 );
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 9 */
/* new-instance p1, Landroid/util/TypedValue; */
/* invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V */
/* .line 10 */
(( android.content.res.TypedArray ) p0 ).getValue ( p4, p1 ); // invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
/* .line 11 */
/* iget p3, p1, Landroid/util/TypedValue;->type:I */
/* const/16 v0, 0x1c */
/* if-lt p3, v0, :cond_0 */
/* const/16 v0, 0x1f */
/* if-gt p3, v0, :cond_0 */
/* .line 12 */
/* iget p0, p1, Landroid/util/TypedValue;->data:I */
c.h.f.i.d .b ( p0 );
/* .line 13 */
} // :cond_0
(( android.content.res.TypedArray ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;
int p3 = 0; // const/4 p3, 0x0
/* .line 14 */
p0 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p4, p3 ); // invoke-virtual {p0, p4, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 15 */
c.h.f.i.d .b ( p1,p0,p2 );
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 16 */
} // :cond_1
c.h.f.i.d .b ( p5 );
} // .end method
public static java.lang.String a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3 ) {
/* .locals 0 */
/* .line 27 */
p1 = c.h.f.i.t .a ( p1,p2 );
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 28 */
} // :cond_0
(( android.content.res.TypedArray ) p0 ).getString ( p3 ); // invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
} // .end method
public static Boolean a ( android.content.res.TypedArray p0, Integer p1, Integer p2, Boolean p3 ) {
/* .locals 0 */
/* .line 31 */
p2 = (( android.content.res.TypedArray ) p0 ).getBoolean ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
/* .line 32 */
p0 = (( android.content.res.TypedArray ) p0 ).getBoolean ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
} // .end method
public static Boolean a ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3, Boolean p4 ) {
/* .locals 0 */
/* .line 4 */
p1 = c.h.f.i.t .a ( p1,p2 );
/* if-nez p1, :cond_0 */
/* .line 5 */
} // :cond_0
p0 = (( android.content.res.TypedArray ) p0 ).getBoolean ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
} // .end method
public static Boolean a ( org.xmlpull.v1.XmlPullParser p0, java.lang.String p1 ) {
/* .locals 1 */
final String v0 = "http://schemas.android.com/apk/res/android"; // const-string v0, "http://schemas.android.com/apk/res/android"
/* .line 1 */
if ( p0 != null) { // if-eqz p0, :cond_0
int p0 = 1; // const/4 p0, 0x1
} // :cond_0
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // .end method
public static Integer b ( android.content.res.TypedArray p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 0 */
/* .line 5 */
p2 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p2, p3 ); // invoke-virtual {p0, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* .line 6 */
p0 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I
} // .end method
public static Integer b ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.h.f.i.t .a ( p1,p2 );
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
p0 = (( android.content.res.TypedArray ) p0 ).getInt ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getInt(II)I
} // .end method
public static android.util.TypedValue b ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3 ) {
/* .locals 0 */
/* .line 3 */
p1 = c.h.f.i.t .a ( p1,p2 );
/* if-nez p1, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
/* .line 4 */
} // :cond_0
(( android.content.res.TypedArray ) p0 ).peekValue ( p3 ); // invoke-virtual {p0, p3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;
} // .end method
public static java.lang.String b ( android.content.res.TypedArray p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 7 */
(( android.content.res.TypedArray ) p0 ).getString ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
/* if-nez p1, :cond_0 */
/* .line 8 */
(( android.content.res.TypedArray ) p0 ).getString ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
} // :cond_0
} // .end method
public static Integer c ( android.content.res.TypedArray p0, org.xmlpull.v1.XmlPullParser p1, java.lang.String p2, Integer p3, Integer p4 ) {
/* .locals 0 */
/* .line 1 */
p1 = c.h.f.i.t .a ( p1,p2 );
/* if-nez p1, :cond_0 */
/* .line 2 */
} // :cond_0
p0 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p3, p4 ); // invoke-virtual {p0, p3, p4}, Landroid/content/res/TypedArray;->getResourceId(II)I
} // .end method
public static java.lang.CharSequence c ( android.content.res.TypedArray p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 3 */
(( android.content.res.TypedArray ) p0 ).getText ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
/* if-nez p1, :cond_0 */
/* .line 4 */
(( android.content.res.TypedArray ) p0 ).getText ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
} // :cond_0
} // .end method
public static java.lang.CharSequence d ( android.content.res.TypedArray p0, Integer p1, Integer p2 ) {
/* .locals 0 */
/* .line 1 */
(( android.content.res.TypedArray ) p0 ).getTextArray ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;
/* if-nez p1, :cond_0 */
/* .line 2 */
(( android.content.res.TypedArray ) p0 ).getTextArray ( p2 ); // invoke-virtual {p0, p2}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;
} // :cond_0
} // .end method
