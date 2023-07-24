.class public Lc/r/d/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/r/d/s;


# direct methods
.method public constructor <init>(Lc/r/d/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/r/d/o;->b:Lc/r/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/r/d/o;->b:Lc/r/d/s;

    const/16 v1, 0x1f4

    invoke-virtual {v0, v1}, Lc/r/d/s;->a(I)V

    return-void
.end method
