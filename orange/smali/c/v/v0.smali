.class public Lc/v/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Landroid/view/View;",
            "Lc/v/u0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lc/e/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/f<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lc/e/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/e/b<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Lc/v/v0;->a:Lc/e/b;

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lc/v/v0;->b:Landroid/util/SparseArray;

    .line 4
    new-instance v0, Lc/e/f;

    invoke-direct {v0}, Lc/e/f;-><init>()V

    iput-object v0, p0, Lc/v/v0;->c:Lc/e/f;

    .line 5
    new-instance v0, Lc/e/b;

    invoke-direct {v0}, Lc/e/b;-><init>()V

    iput-object v0, p0, Lc/v/v0;->d:Lc/e/b;

    return-void
.end method
