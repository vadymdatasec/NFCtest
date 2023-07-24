.class public Lc/f/a/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lc/f/a/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/f/a/h<",
            "Lc/f/a/b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lc/f/a/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/f/a/h<",
            "Lc/f/a/k;",
            ">;"
        }
    .end annotation
.end field

.field public c:[Lc/f/a/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lc/f/a/i;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lc/f/a/i;-><init>(I)V

    iput-object v0, p0, Lc/f/a/c;->a:Lc/f/a/h;

    .line 3
    new-instance v0, Lc/f/a/i;

    invoke-direct {v0, v1}, Lc/f/a/i;-><init>(I)V

    iput-object v0, p0, Lc/f/a/c;->b:Lc/f/a/h;

    const/16 v0, 0x20

    new-array v0, v0, [Lc/f/a/k;

    .line 4
    iput-object v0, p0, Lc/f/a/c;->c:[Lc/f/a/k;

    return-void
.end method
