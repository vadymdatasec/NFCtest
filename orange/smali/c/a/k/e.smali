.class public Lc/a/k/e;
.super Lc/a/k/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/k/d<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc/a/k/f;


# direct methods
.method public constructor <init>(Lc/a/k/f;Ljava/lang/String;ILc/a/k/i/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/a/k/e;->b:Lc/a/k/f;

    iput-object p2, p0, Lc/a/k/e;->a:Ljava/lang/String;

    invoke-direct {p0}, Lc/a/k/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/a/k/e;->b:Lc/a/k/f;

    iget-object v1, p0, Lc/a/k/e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lc/a/k/f;->b(Ljava/lang/String;)V

    return-void
.end method
