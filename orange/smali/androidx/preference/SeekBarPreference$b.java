public class androidx.preference.SeekBarPreference$b implements android.view.View$OnKeyListener {
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
public final androidx.preference.SeekBarPreference b; //synthetic
/* # direct methods */
public androidx.preference.SeekBarPreference$b ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onKey ( android.view.View p0, Integer p1, android.view.KeyEvent p2 ) {
/* .locals 1 */
/* .line 1 */
p1 = (( android.view.KeyEvent ) p3 ).getAction ( ); // invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
int v0 = 0; // const/4 v0, 0x0
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 2 */
} // :cond_0
p1 = this.b;
/* iget-boolean p1, p1, Landroidx/preference/SeekBarPreference;->C:Z */
/* if-nez p1, :cond_2 */
/* const/16 p1, 0x15 */
/* if-eq p2, p1, :cond_1 */
/* const/16 p1, 0x16 */
/* if-ne p2, p1, :cond_2 */
} // :cond_1
} // :cond_2
/* const/16 p1, 0x17 */
/* if-eq p2, p1, :cond_5 */
/* const/16 p1, 0x42 */
/* if-ne p2, p1, :cond_3 */
/* .line 3 */
} // :cond_3
p1 = this.b;
p1 = this.A;
/* if-nez p1, :cond_4 */
final String p1 = "SeekBarPreference"; // const-string p1, "SeekBarPreference"
final String p2 = "SeekBar view is null and hence cannot be adjusted."; // const-string p2, "SeekBar view is null and hence cannot be adjusted."
/* .line 4 */
android.util.Log .e ( p1,p2 );
/* .line 5 */
} // :cond_4
p1 = (( android.widget.SeekBar ) p1 ).onKeyDown ( p2, p3 ); // invoke-virtual {p1, p2, p3}, Landroid/widget/SeekBar;->onKeyDown(ILandroid/view/KeyEvent;)Z
} // :cond_5
} // :goto_0
} // .end method
