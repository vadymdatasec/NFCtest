.class public Lc/a/k/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lc/a/k/b;",
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
.method public createFromParcel(Landroid/os/Parcel;)Lc/a/k/b;
    .locals 1

    .line 2
    new-instance v0, Lc/a/k/b;

    invoke-direct {v0, p1}, Lc/a/k/b;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/k/a;->createFromParcel(Landroid/os/Parcel;)Lc/a/k/b;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lc/a/k/b;
    .locals 0

    .line 2
    new-array p1, p1, [Lc/a/k/b;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lc/a/k/a;->newArray(I)[Lc/a/k/b;

    move-result-object p1

    return-object p1
.end method
