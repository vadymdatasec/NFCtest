.class public final Lc/b/q/l2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$ClassLoaderCreator<",
        "Landroidx/appcompat/widget/Toolbar$g;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Landroidx/appcompat/widget/Toolbar$g;
    .locals 2

    .line 4
    new-instance v0, Landroidx/appcompat/widget/Toolbar$g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/widget/Toolbar$g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/Toolbar$g;
    .locals 1

    .line 3
    new-instance v0, Landroidx/appcompat/widget/Toolbar$g;

    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/Toolbar$g;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/b/q/l2;->createFromParcel(Landroid/os/Parcel;)Landroidx/appcompat/widget/Toolbar$g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lc/b/q/l2;->createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/appcompat/widget/Toolbar$g;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Landroidx/appcompat/widget/Toolbar$g;
    .locals 0

    .line 2
    new-array p1, p1, [Landroidx/appcompat/widget/Toolbar$g;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/b/q/l2;->newArray(I)[Landroidx/appcompat/widget/Toolbar$g;

    move-result-object p1

    return-object p1
.end method
