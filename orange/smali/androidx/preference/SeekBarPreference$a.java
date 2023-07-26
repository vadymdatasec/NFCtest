public class androidx.preference.SeekBarPreference$a implements android.widget.SeekBar$OnSeekBarChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/preference/SeekBarPreference; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.preference.SeekBarPreference a; //synthetic
/* # direct methods */
public androidx.preference.SeekBarPreference$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onProgressChanged ( android.widget.SeekBar p0, Integer p1, Boolean p2 ) {
/* .locals 0 */
if ( p3 != null) { // if-eqz p3, :cond_0
	 /* .line 1 */
	 p2 = this.a;
	 /* iget-boolean p3, p2, Landroidx/preference/SeekBarPreference;->z:Z */
	 /* if-nez p3, :cond_0 */
	 /* .line 2 */
	 (( androidx.preference.SeekBarPreference ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/preference/SeekBarPreference;->a(Landroid/widget/SeekBar;)V
} // :cond_0
return;
} // .end method
public void onStartTrackingTouch ( android.widget.SeekBar p0 ) {
/* .locals 1 */
/* .line 1 */
p1 = this.a;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p1, Landroidx/preference/SeekBarPreference;->z:Z */
return;
} // .end method
public void onStopTrackingTouch ( android.widget.SeekBar p0 ) {
/* .locals 3 */
/* .line 1 */
v0 = this.a;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Landroidx/preference/SeekBarPreference;->z:Z */
/* .line 2 */
v0 = (( android.widget.SeekBar ) p1 ).getProgress ( ); // invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I
v1 = this.a;
/* iget v2, v1, Landroidx/preference/SeekBarPreference;->w:I */
/* add-int/2addr v0, v2 */
/* iget v2, v1, Landroidx/preference/SeekBarPreference;->v:I */
/* if-eq v0, v2, :cond_0 */
/* .line 3 */
(( androidx.preference.SeekBarPreference ) v1 ).a ( p1 ); // invoke-virtual {v1, p1}, Landroidx/preference/SeekBarPreference;->a(Landroid/widget/SeekBar;)V
} // :cond_0
return;
} // .end method
