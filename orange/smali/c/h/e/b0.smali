.class public abstract Lc/h/e/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lc/h/e/b0;)Landroid/app/Notification$BubbleMetadata;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    .line 2
    invoke-static {p0}, Lc/h/e/a0;->a(Lc/h/e/b0;)Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v2, 0x1d

    if-ne v1, v2, :cond_2

    .line 3
    invoke-static {p0}, Lc/h/e/z;->a(Lc/h/e/b0;)Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public abstract a()Z
.end method

.method public abstract b()Landroid/app/PendingIntent;
.end method

.method public abstract c()I
.end method

.method public abstract d()I
.end method

.method public abstract e()Landroidx/core/graphics/drawable/IconCompat;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InvalidNullConversion"
        }
    .end annotation
.end method

.method public abstract f()Landroid/app/PendingIntent;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InvalidNullConversion"
        }
    .end annotation
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()Z
.end method
