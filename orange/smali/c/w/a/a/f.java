public class c.w.a.a.f extends android.graphics.drawable.Drawable$ConstantState {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final android.graphics.drawable.Drawable$ConstantState a;
	 /* # direct methods */
	 public c.w.a.a.f ( ) {
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
		 /* .locals 3 */
		 /* .line 1 */
		 /* new-instance v0, Lc/w/a/a/g; */
		 /* invoke-direct {v0}, Lc/w/a/a/g;-><init>()V */
		 /* .line 2 */
		 v1 = this.a;
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( ); // invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
		 this.b = v1;
		 /* .line 3 */
		 v2 = this.f;
		 (( android.graphics.drawable.Drawable ) v1 ).setCallback ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 } // .end method
	 public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0 ) {
		 /* .locals 2 */
		 /* .line 4 */
		 /* new-instance v0, Lc/w/a/a/g; */
		 /* invoke-direct {v0}, Lc/w/a/a/g;-><init>()V */
		 /* .line 5 */
		 v1 = this.a;
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( p1 ); // invoke-virtual {v1, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
		 this.b = p1;
		 /* .line 6 */
		 v1 = this.f;
		 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( v1 ); // invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 } // .end method
	 public android.graphics.drawable.Drawable newDrawable ( android.content.res.Resources p0, android.content.res.Resources$Theme p1 ) {
		 /* .locals 2 */
		 /* .line 7 */
		 /* new-instance v0, Lc/w/a/a/g; */
		 /* invoke-direct {v0}, Lc/w/a/a/g;-><init>()V */
		 /* .line 8 */
		 v1 = this.a;
		 (( android.graphics.drawable.Drawable$ConstantState ) v1 ).newDrawable ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
		 this.b = p1;
		 /* .line 9 */
		 p2 = this.f;
		 (( android.graphics.drawable.Drawable ) p1 ).setCallback ( p2 ); // invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
	 } // .end method
