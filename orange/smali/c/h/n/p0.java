public abstract class c.h.n.p0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Integer a ( android.view.View p0 ) {
		 /* .locals 0 */
		 /* .line 6 */
		 p0 = 		 (( android.view.View ) p0 ).getImportantForAutofill ( ); // invoke-virtual {p0}, Landroid/view/View;->getImportantForAutofill()I
	 } // .end method
	 public static android.view.View a ( android.view.View p0, android.view.View p1, Integer p2 ) {
		 /* .locals 0 */
		 /* .line 4 */
		 (( android.view.View ) p0 ).keyboardNavigationClusterSearch ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/View;->keyboardNavigationClusterSearch(Landroid/view/View;I)Landroid/view/View;
	 } // .end method
	 public static void a ( android.view.View p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .line 7 */
		 (( android.view.View ) p0 ).setImportantForAutofill ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAutofill(I)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, java.lang.CharSequence p1 ) {
		 /* .locals 0 */
		 /* .line 2 */
		 (( android.view.View ) p0 ).setTooltipText ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V
		 return;
	 } // .end method
	 public static void a ( android.view.View p0, java.util.Collection p1, Integer p2 ) {
		 /* .locals 0 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/view/View;", */
		 /* "Ljava/util/Collection<", */
		 /* "Landroid/view/View;", */
		 /* ">;I)V" */
		 /* } */
	 } // .end annotation
	 /* .line 5 */
	 (( android.view.View ) p0 ).addKeyboardNavigationClusters ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Landroid/view/View;->addKeyboardNavigationClusters(Ljava/util/Collection;I)V
	 return;
} // .end method
public static void a ( android.view.View p0, Boolean p1 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 (( android.view.View ) p0 ).setFocusedByDefault ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setFocusedByDefault(Z)V
	 return;
} // .end method
public static void a ( android.view.View p0, java.lang.String...p1 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 (( android.view.View ) p0 ).setAutofillHints ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setAutofillHints([Ljava/lang/String;)V
	 return;
} // .end method
public static Integer b ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).getNextClusterForwardId ( ); // invoke-virtual {p0}, Landroid/view/View;->getNextClusterForwardId()I
} // .end method
public static void b ( android.view.View p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .line 2 */
	 (( android.view.View ) p0 ).setNextClusterForwardId ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setNextClusterForwardId(I)V
	 return;
} // .end method
public static void b ( android.view.View p0, Boolean p1 ) {
	 /* .locals 0 */
	 /* .line 3 */
	 (( android.view.View ) p0 ).setKeyboardNavigationCluster ( p1 ); // invoke-virtual {p0, p1}, Landroid/view/View;->setKeyboardNavigationCluster(Z)V
	 return;
} // .end method
public static Boolean c ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).hasExplicitFocusable ( ); // invoke-virtual {p0}, Landroid/view/View;->hasExplicitFocusable()Z
} // .end method
public static Boolean d ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).isFocusedByDefault ( ); // invoke-virtual {p0}, Landroid/view/View;->isFocusedByDefault()Z
} // .end method
public static Boolean e ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).isImportantForAutofill ( ); // invoke-virtual {p0}, Landroid/view/View;->isImportantForAutofill()Z
} // .end method
public static Boolean f ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).isKeyboardNavigationCluster ( ); // invoke-virtual {p0}, Landroid/view/View;->isKeyboardNavigationCluster()Z
} // .end method
public static Boolean g ( android.view.View p0 ) {
	 /* .locals 0 */
	 /* .line 1 */
	 p0 = 	 (( android.view.View ) p0 ).restoreDefaultFocus ( ); // invoke-virtual {p0}, Landroid/view/View;->restoreDefaultFocus()Z
} // .end method
