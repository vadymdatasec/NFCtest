.class public final Le/f/a/b/b/a;
.super Le/f/a/b/c/m/j/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le/f/a/b/b/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Landroid/content/Intent;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/a/b/b/h;

    invoke-direct {v0}, Le/f/a/b/b/h;-><init>()V

    sput-object v0, Le/f/a/b/b/a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/b/c/m/j/a;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/a/b/b/a;->b:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final a()Landroid/content/Intent;
    .locals 1

    .line 1
    iget-object v0, p0, Le/f/a/b/b/a;->b:Landroid/content/Intent;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-static {p1}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;)I

    move-result v0

    .line 2
    iget-object v1, p0, Le/f/a/b/b/a;->b:Landroid/content/Intent;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 3
    invoke-static {p1, v0}, Le/f/a/b/c/m/j/b;->a(Landroid/os/Parcel;I)V

    return-void
.end method
