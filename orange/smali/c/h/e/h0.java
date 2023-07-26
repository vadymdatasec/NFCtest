public abstract class c.h.e.h0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.app.RemoteInput a ( c.h.e.h0 p0 ) {
		 /* .locals 4 */
		 /* .line 4 */
		 /* new-instance v0, Landroid/app/RemoteInput$Builder; */
		 /* .line 5 */
		 (( c.h.e.h0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/e/h0;->g()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Landroid/app/RemoteInput$Builder;-><init>(Ljava/lang/String;)V */
		 /* .line 6 */
		 (( c.h.e.h0 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/h0;->f()Ljava/lang/CharSequence;
		 (( android.app.RemoteInput$Builder ) v0 ).setLabel ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setLabel(Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
		 /* .line 7 */
		 (( c.h.e.h0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/h0;->c()[Ljava/lang/CharSequence;
		 (( android.app.RemoteInput$Builder ) v0 ).setChoices ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setChoices([Ljava/lang/CharSequence;)Landroid/app/RemoteInput$Builder;
		 /* .line 8 */
		 v1 = 		 (( c.h.e.h0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/h0;->a()Z
		 (( android.app.RemoteInput$Builder ) v0 ).setAllowFreeFormInput ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->setAllowFreeFormInput(Z)Landroid/app/RemoteInput$Builder;
		 /* .line 9 */
		 (( c.h.e.h0 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/e/h0;->e()Landroid/os/Bundle;
		 (( android.app.RemoteInput$Builder ) v0 ).addExtras ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/RemoteInput$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/RemoteInput$Builder;
		 /* .line 10 */
		 /* const/16 v2, 0x1a */
		 /* if-lt v1, v2, :cond_0 */
		 /* .line 11 */
		 (( c.h.e.h0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/e/h0;->b()Ljava/util/Set;
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 12 */
		 v2 = 		 } // :goto_0
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* check-cast v2, Ljava/lang/String; */
			 int v3 = 1; // const/4 v3, 0x1
			 /* .line 13 */
			 (( android.app.RemoteInput$Builder ) v0 ).setAllowDataType ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/app/RemoteInput$Builder;->setAllowDataType(Ljava/lang/String;Z)Landroid/app/RemoteInput$Builder;
			 /* .line 14 */
		 } // :cond_0
		 /* const/16 v2, 0x1d */
		 /* if-lt v1, v2, :cond_1 */
		 /* .line 15 */
		 p0 = 		 (( c.h.e.h0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/h0;->d()I
		 (( android.app.RemoteInput$Builder ) v0 ).setEditChoicesBeforeSending ( p0 ); // invoke-virtual {v0, p0}, Landroid/app/RemoteInput$Builder;->setEditChoicesBeforeSending(I)Landroid/app/RemoteInput$Builder;
		 /* .line 16 */
	 } // :cond_1
	 (( android.app.RemoteInput$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/RemoteInput$Builder;->build()Landroid/app/RemoteInput;
} // .end method
public static android.app.RemoteInput a ( c.h.e.h0[] p0 ) {
	 /* .locals 3 */
	 /* if-nez p0, :cond_0 */
	 int p0 = 0; // const/4 p0, 0x0
	 /* .line 1 */
} // :cond_0
/* array-length v0, p0 */
/* new-array v0, v0, [Landroid/app/RemoteInput; */
int v1 = 0; // const/4 v1, 0x0
/* .line 2 */
} // :goto_0
/* array-length v2, p0 */
/* if-ge v1, v2, :cond_1 */
/* .line 3 */
/* aget-object v2, p0, v1 */
c.h.e.h0 .a ( v2 );
/* aput-object v2, v0, v1 */
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
} // .end method
/* # virtual methods */
public abstract Boolean a ( ) {
} // .end method
public abstract java.util.Set b ( ) {
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end method
public abstract java.lang.CharSequence c ( ) {
} // .end method
public abstract Integer d ( ) {
} // .end method
public abstract android.os.Bundle e ( ) {
} // .end method
public abstract java.lang.CharSequence f ( ) {
} // .end method
public abstract java.lang.String g ( ) {
} // .end method
