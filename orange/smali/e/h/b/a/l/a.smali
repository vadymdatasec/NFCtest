.class public final synthetic Le/h/b/a/l/a;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Le/h/b/a/l/y0;


# direct methods
.method public synthetic constructor <init>(Le/h/b/a/l/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/h/b/a/l/a;->b:Le/h/b/a/l/y0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Le/h/b/a/l/a;->b:Le/h/b/a/l/y0;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->c()V

    return-void
.end method
