public class c.b.q.k2 {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.content.Context a;
	 public final android.content.res.TypedArray b;
	 public android.util.TypedValue c;
	 /* # direct methods */
	 public c.b.q.k2 ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 /* .line 3 */
		 this.b = p2;
		 return;
	 } // .end method
	 public static c.b.q.k2 a ( android.content.Context p0, Integer p1, Integer[] p2 ) {
		 /* .locals 1 */
		 /* .line 4 */
		 /* new-instance v0, Lc/b/q/k2; */
		 (( android.content.Context ) p0 ).obtainStyledAttributes ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;
		 /* invoke-direct {v0, p0, p1}, Lc/b/q/k2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V */
	 } // .end method
	 public static c.b.q.k2 a ( android.content.Context p0, android.util.AttributeSet p1, Integer[] p2 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* new-instance v0, Lc/b/q/k2; */
		 (( android.content.Context ) p0 ).obtainStyledAttributes ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
		 /* invoke-direct {v0, p0, p1}, Lc/b/q/k2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V */
	 } // .end method
	 public static c.b.q.k2 a ( android.content.Context p0, android.util.AttributeSet p1, Integer[] p2, Integer p3, Integer p4 ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* new-instance v0, Lc/b/q/k2; */
		 /* .line 3 */
		 (( android.content.Context ) p0 ).obtainStyledAttributes ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
		 /* invoke-direct {v0, p0, p1}, Lc/b/q/k2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V */
	 } // .end method
	 /* # virtual methods */
	 public Float a ( Integer p0, Float p1 ) {
		 /* .locals 1 */
		 /* .line 10 */
		 v0 = this.b;
		 p1 = 		 (( android.content.res.TypedArray ) v0 ).getFloat ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getFloat(IF)F
	 } // .end method
	 public Integer a ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 11 */
		 v0 = this.b;
		 p1 = 		 (( android.content.res.TypedArray ) v0 ).getColor ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getColor(II)I
	 } // .end method
	 public android.content.res.ColorStateList a ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 12 */
		 v0 = this.b;
		 v0 = 		 (( android.content.res.TypedArray ) v0 ).hasValue ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 13 */
			 v0 = this.b;
			 int v1 = 0; // const/4 v1, 0x0
			 v0 = 			 (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 14 */
				 v1 = this.a;
				 /* .line 15 */
				 c.b.l.a.b .b ( v1,v0 );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 16 */
				 } // :cond_0
				 v0 = this.b;
				 (( android.content.res.TypedArray ) v0 ).getColorStateList ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;
			 } // .end method
			 public android.graphics.Typeface a ( Integer p0, Integer p1, Object p2 ) {
				 /* .locals 2 */
				 /* .line 5 */
				 v0 = this.b;
				 int v1 = 0; // const/4 v1, 0x0
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
				 /* if-nez p1, :cond_0 */
				 int p1 = 0; // const/4 p1, 0x0
				 /* .line 6 */
			 } // :cond_0
			 v0 = this.c;
			 /* if-nez v0, :cond_1 */
			 /* .line 7 */
			 /* new-instance v0, Landroid/util/TypedValue; */
			 /* invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V */
			 this.c = v0;
			 /* .line 8 */
		 } // :cond_1
		 v0 = this.a;
		 v1 = this.c;
		 c.h.f.i.s .a ( v0,p1,v1,p2,p3 );
	 } // .end method
	 public void a ( ) {
		 /* .locals 1 */
		 /* .line 17 */
		 v0 = this.b;
		 (( android.content.res.TypedArray ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
		 return;
	 } // .end method
	 public Boolean a ( Integer p0, Boolean p1 ) {
		 /* .locals 1 */
		 /* .line 9 */
		 v0 = this.b;
		 p1 = 		 (( android.content.res.TypedArray ) v0 ).getBoolean ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
	 } // .end method
	 public Integer b ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 /* .line 5 */
		 v0 = this.b;
		 p1 = 		 (( android.content.res.TypedArray ) v0 ).getDimensionPixelOffset ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
	 } // .end method
	 public android.graphics.drawable.Drawable b ( Integer p0 ) {
		 /* .locals 2 */
		 /* .line 1 */
		 v0 = this.b;
		 v0 = 		 (( android.content.res.TypedArray ) v0 ).hasValue ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = this.b;
			 int v1 = 0; // const/4 v1, 0x0
			 v0 = 			 (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 3 */
				 p1 = this.a;
				 c.b.l.a.b .c ( p1,v0 );
				 /* .line 4 */
			 } // :cond_0
			 v0 = this.b;
			 (( android.content.res.TypedArray ) v0 ).getDrawable ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
		 } // .end method
		 public Integer c ( Integer p0, Integer p1 ) {
			 /* .locals 1 */
			 /* .line 4 */
			 v0 = this.b;
			 p1 = 			 (( android.content.res.TypedArray ) v0 ).getDimensionPixelSize ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
		 } // .end method
		 public android.graphics.drawable.Drawable c ( Integer p0 ) {
			 /* .locals 3 */
			 /* .line 1 */
			 v0 = this.b;
			 v0 = 			 (( android.content.res.TypedArray ) v0 ).hasValue ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 2 */
				 v0 = this.b;
				 int v1 = 0; // const/4 v1, 0x0
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I
				 if ( p1 != null) { // if-eqz p1, :cond_0
					 /* .line 3 */
					 c.b.q.s .b ( );
					 v1 = this.a;
					 int v2 = 1; // const/4 v2, 0x1
					 (( c.b.q.s ) v0 ).a ( v1, p1, v2 ); // invoke-virtual {v0, v1, p1, v2}, Lc/b/q/s;->a(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
				 } // :cond_0
				 int p1 = 0; // const/4 p1, 0x0
			 } // .end method
			 public Integer d ( Integer p0, Integer p1 ) {
				 /* .locals 1 */
				 /* .line 2 */
				 v0 = this.b;
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getInt ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I
			 } // .end method
			 public java.lang.String d ( Integer p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.b;
				 (( android.content.res.TypedArray ) v0 ).getString ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
			 } // .end method
			 public Integer e ( Integer p0, Integer p1 ) {
				 /* .locals 1 */
				 /* .line 2 */
				 v0 = this.b;
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getInteger ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getInteger(II)I
			 } // .end method
			 public java.lang.CharSequence e ( Integer p0 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.b;
				 (( android.content.res.TypedArray ) v0 ).getText ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
			 } // .end method
			 public Integer f ( Integer p0, Integer p1 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.b;
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getLayoutDimension ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
			 } // .end method
			 public java.lang.CharSequence f ( Integer p0 ) {
				 /* .locals 1 */
				 /* .line 2 */
				 v0 = this.b;
				 (( android.content.res.TypedArray ) v0 ).getTextArray ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;
			 } // .end method
			 public Integer g ( Integer p0, Integer p1 ) {
				 /* .locals 1 */
				 /* .line 1 */
				 v0 = this.b;
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).getResourceId ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/content/res/TypedArray;->getResourceId(II)I
			 } // .end method
			 public Boolean g ( Integer p0 ) {
				 /* .locals 1 */
				 /* .line 2 */
				 v0 = this.b;
				 p1 = 				 (( android.content.res.TypedArray ) v0 ).hasValue ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z
			 } // .end method
