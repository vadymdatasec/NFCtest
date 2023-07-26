public class androidx.preference.CheckBoxPreference$a implements android.widget.CompoundButton$OnCheckedChangeListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/preference/CheckBoxPreference; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "a" */
} // .end annotation
/* # instance fields */
public final androidx.preference.CheckBoxPreference a; //synthetic
/* # direct methods */
public androidx.preference.CheckBoxPreference$a ( ) {
/* .locals 0 */
/* .line 1 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCheckedChanged ( android.widget.CompoundButton p0, Boolean p1 ) {
/* .locals 2 */
/* .line 1 */
v0 = this.a;
java.lang.Boolean .valueOf ( p2 );
v0 = (( androidx.preference.Preference ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Landroidx/preference/Preference;->a(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* xor-int/lit8 p2, p2, 0x1 */
/* .line 2 */
(( android.widget.CompoundButton ) p1 ).setChecked ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V
return;
/* .line 3 */
} // :cond_0
p1 = this.a;
(( androidx.preference.TwoStatePreference ) p1 ).d ( p2 ); // invoke-virtual {p1, p2}, Landroidx/preference/TwoStatePreference;->d(Z)V
return;
} // .end method
