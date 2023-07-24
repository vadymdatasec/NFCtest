.class public Lc/r/d/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            ">;"
        }
    .end annotation
.end field

.field public b:I

.field public c:J

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/r/d/g0;->a:Ljava/util/ArrayList;

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lc/r/d/g0;->b:I

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lc/r/d/g0;->c:J

    .line 5
    iput-wide v0, p0, Lc/r/d/g0;->d:J

    return-void
.end method
