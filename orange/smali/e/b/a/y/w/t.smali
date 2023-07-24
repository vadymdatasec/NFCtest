.class public final Le/b/a/y/w/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/b/a/y/w/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le/b/a/y/w/f<",
        "Landroid/os/ParcelFileDescriptor;",
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
.method public a(Landroid/os/ParcelFileDescriptor;)Le/b/a/y/w/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/ParcelFileDescriptor;",
            ")",
            "Le/b/a/y/w/g<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;

    invoke-direct {v0, p1}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;-><init>(Landroid/os/ParcelFileDescriptor;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Le/b/a/y/w/g;
    .locals 0

    .line 1
    check-cast p1, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p0, p1}, Le/b/a/y/w/t;->a(Landroid/os/ParcelFileDescriptor;)Le/b/a/y/w/g;

    move-result-object p1

    return-object p1
.end method

.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Landroid/os/ParcelFileDescriptor;",
            ">;"
        }
    .end annotation

    .line 3
    const-class v0, Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method
