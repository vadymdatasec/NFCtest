public abstract class c.h.e.a0 {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static android.app.Notification$BubbleMetadata a ( c.h.e.b0 p0 ) {
		 /* .locals 3 */
		 /* if-nez p0, :cond_0 */
		 int p0 = 0; // const/4 p0, 0x0
		 /* .line 1 */
	 } // :cond_0
	 (( c.h.e.b0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/e/b0;->g()Ljava/lang/String;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 2 */
		 /* new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder; */
		 /* .line 3 */
		 (( c.h.e.b0 ) p0 ).g ( ); // invoke-virtual {p0}, Lc/h/e/b0;->g()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Ljava/lang/String;)V */
		 /* .line 4 */
	 } // :cond_1
	 /* new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder; */
	 /* .line 5 */
	 (( c.h.e.b0 ) p0 ).f ( ); // invoke-virtual {p0}, Lc/h/e/b0;->f()Landroid/app/PendingIntent;
	 (( c.h.e.b0 ) p0 ).e ( ); // invoke-virtual {p0}, Lc/h/e/b0;->e()Landroidx/core/graphics/drawable/IconCompat;
	 (( androidx.core.graphics.drawable.IconCompat ) v2 ).g ( ); // invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->g()Landroid/graphics/drawable/Icon;
	 /* invoke-direct {v0, v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;)V */
	 /* .line 6 */
} // :goto_0
(( c.h.e.b0 ) p0 ).b ( ); // invoke-virtual {p0}, Lc/h/e/b0;->b()Landroid/app/PendingIntent;
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDeleteIntent ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 7 */
v2 = (( c.h.e.b0 ) p0 ).a ( ); // invoke-virtual {p0}, Lc/h/e/b0;->a()Z
(( android.app.Notification$BubbleMetadata$Builder ) v1 ).setAutoExpandBubble ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setAutoExpandBubble(Z)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 8 */
v2 = (( c.h.e.b0 ) p0 ).h ( ); // invoke-virtual {p0}, Lc/h/e/b0;->h()Z
(( android.app.Notification$BubbleMetadata$Builder ) v1 ).setSuppressNotification ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setSuppressNotification(Z)Landroid/app/Notification$BubbleMetadata$Builder;
/* .line 9 */
v1 = (( c.h.e.b0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/b0;->c()I
if ( v1 != null) { // if-eqz v1, :cond_2
	 /* .line 10 */
	 v1 = 	 (( c.h.e.b0 ) p0 ).c ( ); // invoke-virtual {p0}, Lc/h/e/b0;->c()I
	 (( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDesiredHeight ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeight(I)Landroid/app/Notification$BubbleMetadata$Builder;
	 /* .line 11 */
} // :cond_2
v1 = (( c.h.e.b0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/b0;->d()I
if ( v1 != null) { // if-eqz v1, :cond_3
	 /* .line 12 */
	 p0 = 	 (( c.h.e.b0 ) p0 ).d ( ); // invoke-virtual {p0}, Lc/h/e/b0;->d()I
	 /* .line 13 */
	 (( android.app.Notification$BubbleMetadata$Builder ) v0 ).setDesiredHeightResId ( p0 ); // invoke-virtual {v0, p0}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeightResId(I)Landroid/app/Notification$BubbleMetadata$Builder;
	 /* .line 14 */
} // :cond_3
(( android.app.Notification$BubbleMetadata$Builder ) v0 ).build ( ); // invoke-virtual {v0}, Landroid/app/Notification$BubbleMetadata$Builder;->build()Landroid/app/Notification$BubbleMetadata;
} // .end method
