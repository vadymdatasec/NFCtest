.class public final Le/f/c/u/b0;
.super Le/f/a/b/c/m/j/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Le/f/c/u/b0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Landroid/os/Bundle;

.field public c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le/f/c/u/c0;

    invoke-direct {v0}, Le/f/c/u/c0;-><init>()V

    sput-object v0, Le/f/c/u/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le/f/a/b/c/m/j/a;-><init>()V

    .line 2
    iput-object p1, p0, Le/f/c/u/b0;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Le/f/c/u/b0;->c:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Le/f/c/u/b0;->b:Landroid/os/Bundle;

    invoke-static {v0}, Le/f/c/u/c$a;->a(Landroid/os/Bundle;)Lc/e/b;

    move-result-object v0

    iput-object v0, p0, Le/f/c/u/b0;->c:Ljava/util/Map;

    .line 3
    :cond_0
    iget-object v0, p0, Le/f/c/u/b0;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Le/f/c/u/c0;->a(Le/f/c/u/b0;Landroid/os/Parcel;I)V

    return-void
.end method
