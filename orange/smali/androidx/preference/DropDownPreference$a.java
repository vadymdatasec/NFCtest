public class androidx.preference.DropDownPreference$a implements android.widget.AdapterView$OnItemSelectedListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Landroidx/preference/DropDownPreference; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = null */
} // .end annotation
/* # instance fields */
public final androidx.preference.DropDownPreference b; //synthetic
/* # direct methods */
public androidx.preference.DropDownPreference$a ( ) {
/* .locals 0 */
/* .line 1 */
this.b = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onItemSelected ( android.widget.AdapterView p0, android.view.View p1, Integer p2, Long p3 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;", */
/* "Landroid/view/View;", */
/* "IJ)V" */
/* } */
} // .end annotation
/* if-ltz p3, :cond_0 */
/* .line 1 */
p1 = this.b;
(( androidx.preference.ListPreference ) p1 ).s ( ); // invoke-virtual {p1}, Landroidx/preference/ListPreference;->s()[Ljava/lang/CharSequence;
/* aget-object p1, p1, p3 */
/* .line 2 */
p2 = this.b;
(( androidx.preference.ListPreference ) p2 ).t ( ); // invoke-virtual {p2}, Landroidx/preference/ListPreference;->t()Ljava/lang/String;
p2 = (( java.lang.String ) p1 ).equals ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez p2, :cond_0 */
p2 = this.b;
p2 = (( androidx.preference.Preference ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Landroidx/preference/Preference;->a(Ljava/lang/Object;)Z
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 3 */
p2 = this.b;
(( androidx.preference.ListPreference ) p2 ).d ( p1 ); // invoke-virtual {p2, p1}, Landroidx/preference/ListPreference;->d(Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
public void onNothingSelected ( android.widget.AdapterView p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/widget/AdapterView<", */
/* "*>;)V" */
/* } */
} // .end annotation
return;
} // .end method
