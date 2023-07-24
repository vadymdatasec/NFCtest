.class public Lc/l/d/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lc/l/d/i3;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/Fragment;Lc/l/d/i3;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lc/l/d/v;->b:Lc/l/d/i3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc/l/d/v;->b:Lc/l/d/i3;

    invoke-virtual {v0}, Lc/l/d/i3;->a()V

    return-void
.end method
