.class public abstract Lc/h/e/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lc/h/e/b0;)Landroid/app/Notification$BubbleMetadata;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    invoke-virtual {p0}, Lc/h/e/b0;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder;

    .line 3
    invoke-virtual {p0}, Lc/h/e/b0;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_1
    new-instance v0, Landroid/app/Notification$BubbleMetadata$Builder;

    .line 5
    invoke-virtual {p0}, Lc/h/e/b0;->f()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {p0}, Lc/h/e/b0;->e()Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/core/graphics/drawable/IconCompat;->g()Landroid/graphics/drawable/Icon;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;-><init>(Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;)V

    .line 6
    :goto_0
    invoke-virtual {p0}, Lc/h/e/b0;->b()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lc/h/e/b0;->a()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setAutoExpandBubble(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    move-result-object v1

    .line 8
    invoke-virtual {p0}, Lc/h/e/b0;->h()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/app/Notification$BubbleMetadata$Builder;->setSuppressNotification(Z)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 9
    invoke-virtual {p0}, Lc/h/e/b0;->c()I

    move-result v1

    if-eqz v1, :cond_2

    .line 10
    invoke-virtual {p0}, Lc/h/e/b0;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeight(I)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 11
    :cond_2
    invoke-virtual {p0}, Lc/h/e/b0;->d()I

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {p0}, Lc/h/e/b0;->d()I

    move-result p0

    .line 13
    invoke-virtual {v0, p0}, Landroid/app/Notification$BubbleMetadata$Builder;->setDesiredHeightResId(I)Landroid/app/Notification$BubbleMetadata$Builder;

    .line 14
    :cond_3
    invoke-virtual {v0}, Landroid/app/Notification$BubbleMetadata$Builder;->build()Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0
.end method
