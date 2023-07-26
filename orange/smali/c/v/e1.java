public abstract class c.v.e1 implements c.v.g1 {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 public c.v.d1 a;
	 /* # direct methods */
	 public c.v.e1 ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 2 */
		 /* new-instance v0, Lc/v/d1; */
		 /* invoke-direct {v0, p1, p2, p3, p0}, Lc/v/d1;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lc/v/e1;)V */
		 this.a = v0;
		 return;
	 } // .end method
	 public static c.v.e1 c ( android.view.View p0 ) {
		 /* .locals 5 */
		 /* .line 1 */
		 c.v.e1 .d ( p0 );
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* .line 2 */
			 v1 = 			 (( android.view.ViewGroup ) v0 ).getChildCount ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I
			 int v2 = 0; // const/4 v2, 0x0
		 } // :goto_0
		 /* if-ge v2, v1, :cond_1 */
		 /* .line 3 */
		 (( android.view.ViewGroup ) v0 ).getChildAt ( v2 ); // invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
		 /* .line 4 */
		 /* instance-of v4, v3, Lc/v/d1; */
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 5 */
			 /* check-cast v3, Lc/v/d1; */
			 p0 = this.e;
		 } // :cond_0
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* .line 6 */
	 } // :cond_1
	 /* new-instance v1, Lc/v/w0; */
	 (( android.view.ViewGroup ) v0 ).getContext ( ); // invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
	 /* invoke-direct {v1, v2, v0, p0}, Lc/v/w0;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;)V */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
public static android.view.ViewGroup d ( android.view.View p0 ) {
/* .locals 2 */
} // :cond_0
} // :goto_0
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 1 */
v0 = (( android.view.View ) p0 ).getId ( ); // invoke-virtual {p0}, Landroid/view/View;->getId()I
/* const v1, 0x1020002 */
/* if-ne v0, v1, :cond_1 */
/* instance-of v0, p0, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 2 */
/* check-cast p0, Landroid/view/ViewGroup; */
/* .line 3 */
} // :cond_1
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* instance-of v0, v0, Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 4 */
(( android.view.View ) p0 ).getParent ( ); // invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
/* check-cast p0, Landroid/view/ViewGroup; */
} // :cond_2
int p0 = 0; // const/4 p0, 0x0
} // .end method
/* # virtual methods */
public void a ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.v.d1 ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lc/v/d1;->a(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
public void b ( android.graphics.drawable.Drawable p0 ) {
/* .locals 1 */
/* .line 1 */
v0 = this.a;
(( c.v.d1 ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lc/v/d1;->b(Landroid/graphics/drawable/Drawable;)V
return;
} // .end method
