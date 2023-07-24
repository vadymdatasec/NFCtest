.class public Lc/b/m/a/d;
.super Lc/b/m/a/g;
.source "SourceFile"


# instance fields
.field public final a:Lc/w/a/a/g;


# direct methods
.method public constructor <init>(Lc/w/a/a/g;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lc/b/m/a/g;-><init>(Lc/b/m/a/a;)V

    .line 2
    iput-object p1, p0, Lc/b/m/a/d;->a:Lc/w/a/a/g;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/m/a/d;->a:Lc/w/a/a/g;

    invoke-virtual {v0}, Lc/w/a/a/g;->start()V

    return-void
.end method

.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/b/m/a/d;->a:Lc/w/a/a/g;

    invoke-virtual {v0}, Lc/w/a/a/g;->stop()V

    return-void
.end method
