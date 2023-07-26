public class c.w.a.a.v extends android.graphics.drawable.Drawable$ConstantState {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.graphics.drawable.Drawable$ConstantState a;
	 /* # direct methods */
	 public c.w.a.a.v ( ) {
		 /* .locals 0 */
		 /* .line 1 */
		 /* invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V */
		 /* .line 2 */
		 this.a = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean canApplyTheme ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable$ConstantState ) v0 ).canApplyTheme ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->canApplyTheme()Z
	 } // .end method
	 public Integer getChangingConfigurations ( ) {
		 /* .locals 1 */
		 /* .line 1 */
		 v0 = this.a;
		 v0 = 		 (( android.graphics.drawable.Drawable$ConstantState ) v0 ).getChangingConfigurations ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->getChangingConfigurations()I
	 } // .end method
	 public android.graphics.drawable.Drawable newDrawable ( ) {
		 /* .locals 2 */
		 /* .line 1 */
		 /* new-instance v0, Lc/w/a/a/w; */
		 /* invoke-direct {v0}, Lc/w/a/a/w;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
		 /* check-cast v1, Landroid/graphics/drawable/VectorDrawable; */
		 this.b = v1;
	 } // .end method
	 public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
		 /* .locals 2 */
		 /* .line 3 */
		 /* new-instance v0, Lc/w/a/a/w; */
		 /* invoke-direct {v0}, Lc/w/a/a/w;-><init>()V */
		 /* .line 4 */
		 v1 = this.a;
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
		 /* check-cast p1, Landroid/graphics/drawable/VectorDrawable; */
		 this.b = p1;
	 } // .end method
	 public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0, android.content.res.Resources$Theme p1 ) {
		 /* .locals 2 */
		 /* .line 5 */
		 /* new-instance v0, Lc/w/a/a/w; */
		 /* invoke-direct {v0}, Lc/w/a/a/w;-><init>()V */
		 /* .line 6 */
		 v1 = this.a;
		 /* .line 7 */
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
		 /* check-cast p1, Landroid/graphics/drawable/VectorDrawable; */
		 this.b = p1;
	 } // .end method
