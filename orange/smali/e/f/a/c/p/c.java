public abstract class e.f.a.c.p.c {
	 /* .source "SourceFile" */
	 /* # static fields */
	 public static final a;
	 public static final b;
	 /* # direct methods */
	 public static e.f.a.c.p.c ( ) {
		 /* .locals 4 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v1, v0, [I */
		 /* .line 1 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* aput v2, v1, v3 */
		 /* new-array v0, v0, [I */
		 /* .line 2 */
		 /* aput v1, v0, v3 */
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .line 19 */
		 v0 = e.f.a.c.p.c.a;
		 final String v1 = "Theme.AppCompat"; // const-string v1, "Theme.AppCompat"
		 e.f.a.c.p.c .a ( p0,v0,v1 );
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0, android.util.AttributeSet p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = e.f.a.c.i.ThemeEnforcement;
		 /* .line 2 */
		 (( android.content.Context ) p0 ).obtainStyledAttributes ( p1, v0, p2, p3 ); // invoke-virtual {p0, p1, v0, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 3 */
		 int p3 = 0; // const/4 p3, 0x0
		 /* .line 4 */
		 p2 = 		 (( android.content.res.TypedArray ) p1 ).getBoolean ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* .line 5 */
		 (( android.content.res.TypedArray ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 6 */
			 e.f.a.c.p.c .b ( p0 );
			 /* .line 7 */
		 } // :cond_0
		 e.f.a.c.p.c .a ( p0 );
		 return;
	 } // .end method
	 public static void a ( android.content.Context p0, android.util.AttributeSet p1, Integer[] p2, Integer p3, Integer p4, Integer...p5 ) {
		 /* .locals 3 */
		 /* .line 8 */
		 v0 = e.f.a.c.i.ThemeEnforcement;
		 /* .line 9 */
		 (( android.content.Context ) p0 ).obtainStyledAttributes ( p1, v0, p3, p4 ); // invoke-virtual {p0, p1, v0, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* .line 10 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 11 */
		 v1 = 		 (( android.content.res.TypedArray ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
		 /* if-nez v1, :cond_0 */
		 /* .line 12 */
		 (( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // :cond_0
	 if ( p5 != null) { // if-eqz p5, :cond_2
		 /* .line 13 */
		 /* array-length v1, p5 */
		 /* if-nez v1, :cond_1 */
		 /* .line 14 */
	 } // :cond_1
	 p0 = 	 /* invoke-static/range {p0 ..p5}, Le/f/a/c/p/c;->b(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Z */
	 /* .line 15 */
} // :cond_2
} // :goto_0
int p1 = -1; // const/4 p1, -0x1
/* .line 16 */
p0 = (( android.content.res.TypedArray ) v0 ).getResourceId ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-eq p0, p1, :cond_3 */
int v2 = 1; // const/4 v2, 0x1
} // :cond_3
/* move p0, v2 */
/* .line 17 */
} // :goto_1
(( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
if ( p0 != null) { // if-eqz p0, :cond_4
return;
/* .line 18 */
} // :cond_4
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
final String p1 = "This component requires that you specify a valid TextAppearance attribute.Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."; // const-string p1, "This component requires that you specify a valid TextAppearance attribute.Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static void a ( android.content.Context p0, Integer[] p1, java.lang.String p2 ) {
/* .locals 1 */
/* .line 23 */
p0 = e.f.a.c.p.c .a ( p0,p1 );
if ( p0 != null) { // if-eqz p0, :cond_0
return;
/* .line 24 */
} // :cond_0
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
/* invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V */
final String v0 = "The style on this component requires your app theme to be "; // const-string v0, "The style on this component requires your app theme to be "
(( java.lang.StringBuilder ) p1 ).append ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String p2 = " (or a descendant)."; // const-string p2, " (or a descendant)."
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
} // .end method
public static Boolean a ( android.content.Context p0, Integer[] p1 ) {
/* .locals 0 */
/* .line 20 */
(( android.content.Context ) p0 ).obtainStyledAttributes ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
int p1 = 0; // const/4 p1, 0x0
/* .line 21 */
p1 = (( android.content.res.TypedArray ) p0 ).hasValue ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z
/* .line 22 */
(( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
} // .end method
public static void b ( android.content.Context p0 ) {
/* .locals 2 */
/* .line 6 */
v0 = e.f.a.c.p.c.b;
final String v1 = "Theme.MaterialComponents"; // const-string v1, "Theme.MaterialComponents"
e.f.a.c.p.c .a ( p0,v0,v1 );
return;
} // .end method
public static Boolean b ( android.content.Context p0, android.util.AttributeSet p1, Integer[] p2, Integer p3, Integer p4, Integer...p5 ) {
/* .locals 1 */
/* .line 1 */
(( android.content.Context ) p0 ).obtainStyledAttributes ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
/* .line 2 */
/* array-length p1, p5 */
int p2 = 0; // const/4 p2, 0x0
int p3 = 0; // const/4 p3, 0x0
} // :goto_0
/* if-ge p3, p1, :cond_1 */
/* aget p4, p5, p3 */
int v0 = -1; // const/4 v0, -0x1
/* .line 3 */
p4 = (( android.content.res.TypedArray ) p0 ).getResourceId ( p4, v0 ); // invoke-virtual {p0, p4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I
/* if-ne p4, v0, :cond_0 */
/* .line 4 */
(( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
} // :cond_0
/* add-int/lit8 p3, p3, 0x1 */
/* .line 5 */
} // :cond_1
(( android.content.res.TypedArray ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static android.content.res.TypedArray c ( android.content.Context p0, android.util.AttributeSet p1, Integer[] p2, Integer p3, Integer p4, Integer...p5 ) {
/* .locals 0 */
/* .line 1 */
e.f.a.c.p.c .a ( p0,p1,p3,p4 );
/* .line 2 */
/* invoke-static/range {p0 ..p5}, Le/f/a/c/p/c;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V */
/* .line 3 */
(( android.content.Context ) p0 ).obtainStyledAttributes ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
} // .end method
