.class public Lc/h/f/i/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc/h/f/i/r;


# direct methods
.method public constructor <init>(Lc/h/f/i/r;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc/h/f/i/q;->c:Lc/h/f/i/r;

    iput p2, p0, Lc/h/f/i/q;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lc/h/f/i/q;->c:Lc/h/f/i/r;

    iget v1, p0, Lc/h/f/i/q;->b:I

    invoke-virtual {v0, v1}, Lc/h/f/i/r;->a(I)V

    return-void
.end method
