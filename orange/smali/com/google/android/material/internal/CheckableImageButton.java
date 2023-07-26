public class com.google.android.material.internal.CheckableImageButton extends c.b.q.v implements android.widget.Checkable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # static fields */
	 public static final e;
	 /* # instance fields */
	 public Boolean d;
	 /* # direct methods */
	 public static com.google.android.material.internal.CheckableImageButton ( ) {
		 /* .locals 3 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const v2, 0x10100a0 */
		 /* aput v2, v0, v1 */
		 /* .line 1 */
		 return;
	 } // .end method
	 public com.google.android.material.internal.CheckableImageButton ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 1 */
		 /* invoke-direct {p0, p1, v0}, Lcom/google/android/material/internal/CheckableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 public com.google.android.material.internal.CheckableImageButton ( ) {
		 /* .locals 1 */
		 /* .line 2 */
		 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/CheckableImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 return;
	 } // .end method
	 public com.google.android.material.internal.CheckableImageButton ( ) {
		 /* .locals 0 */
		 /* .line 3 */
		 /* invoke-direct {p0, p1, p2, p3}, Lc/b/q/v;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
		 /* .line 4 */
		 /* new-instance p1, Lcom/google/android/material/internal/CheckableImageButton$a; */
		 /* invoke-direct {p1, p0}, Lcom/google/android/material/internal/CheckableImageButton$a;-><init>(Lcom/google/android/material/internal/CheckableImageButton;)V */
		 c.h.n.v0 .a ( p0,p1 );
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean isChecked ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z */
	 } // .end method
	 public onCreateDrawableState ( Integer p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 2 */
			 v0 = com.google.android.material.internal.CheckableImageButton.e;
			 /* array-length v0, v0 */
			 /* add-int/2addr p1, v0 */
			 /* .line 3 */
			 /* invoke-super {p0, p1}, Landroid/widget/ImageButton;->onCreateDrawableState(I)[I */
			 v0 = com.google.android.material.internal.CheckableImageButton.e;
			 /* .line 4 */
			 android.widget.ImageButton .mergeDrawableStates ( p1,v0 );
			 /* .line 5 */
		 } // :cond_0
		 /* invoke-super {p0, p1}, Landroid/widget/ImageButton;->onCreateDrawableState(I)[I */
	 } // .end method
	 public void setChecked ( Boolean p0 ) {
		 /* .locals 1 */
		 /* .line 1 */
		 /* iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z */
		 /* if-eq v0, p1, :cond_0 */
		 /* .line 2 */
		 /* iput-boolean p1, p0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z */
		 /* .line 3 */
		 (( android.widget.ImageButton ) p0 ).refreshDrawableState ( ); // invoke-virtual {p0}, Landroid/widget/ImageButton;->refreshDrawableState()V
		 /* const/16 p1, 0x800 */
		 /* .line 4 */
		 (( android.widget.ImageButton ) p0 ).sendAccessibilityEvent ( p1 ); // invoke-virtual {p0, p1}, Landroid/widget/ImageButton;->sendAccessibilityEvent(I)V
	 } // :cond_0
	 return;
} // .end method
public void toggle ( ) {
	 /* .locals 1 */
	 /* .line 1 */
	 /* iget-boolean v0, p0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z */
	 /* xor-int/lit8 v0, v0, 0x1 */
	 (( com.google.android.material.internal.CheckableImageButton ) p0 ).setChecked ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V
	 return;
} // .end method
