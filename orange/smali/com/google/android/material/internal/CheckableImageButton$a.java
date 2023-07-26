public class com.google.android.material.internal.CheckableImageButton$a extends c.h.n.d {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/android/material/internal/CheckableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final com.google.android.material.internal.CheckableImageButton d; //synthetic
/* # direct methods */
public com.google.android.material.internal.CheckableImageButton$a ( ) {
/* .locals 0 */
/* .line 1 */
this.d = p1;
/* invoke-direct {p0}, Lc/h/n/d;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void a ( android.view.View p0, Object p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->a(Landroid/view/View;Lc/h/n/v1/h;)V */
int p1 = 1; // const/4 p1, 0x1
/* .line 2 */
(( c.h.n.v1.h ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->a(Z)V
/* .line 3 */
p1 = this.d;
p1 = (( com.google.android.material.internal.CheckableImageButton ) p1 ).isChecked ( ); // invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z
(( c.h.n.v1.h ) p2 ).b ( p1 ); // invoke-virtual {p2, p1}, Lc/h/n/v1/h;->b(Z)V
return;
} // .end method
public void b ( android.view.View p0, android.view.accessibility.AccessibilityEvent p1 ) {
/* .locals 0 */
/* .line 1 */
/* invoke-super {p0, p1, p2}, Lc/h/n/d;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V */
/* .line 2 */
p1 = this.d;
p1 = (( com.google.android.material.internal.CheckableImageButton ) p1 ).isChecked ( ); // invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->isChecked()Z
(( android.view.accessibility.AccessibilityEvent ) p2 ).setChecked ( p1 ); // invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityEvent;->setChecked(Z)V
return;
} // .end method
