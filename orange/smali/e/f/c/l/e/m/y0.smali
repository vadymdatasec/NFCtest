.class public Le/f/c/l/e/m/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Le/f/c/l/e/v/f;

.field public final synthetic c:Le/f/c/l/e/m/b1;


# direct methods
.method public constructor <init>(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/f/c/l/e/m/y0;->c:Le/f/c/l/e/m/b1;

    iput-object p2, p0, Le/f/c/l/e/m/y0;->b:Le/f/c/l/e/v/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le/f/c/l/e/m/y0;->c:Le/f/c/l/e/m/b1;

    iget-object v1, p0, Le/f/c/l/e/m/y0;->b:Le/f/c/l/e/v/f;

    invoke-static {v0, v1}, Le/f/c/l/e/m/b1;->a(Le/f/c/l/e/m/b1;Le/f/c/l/e/v/f;)Le/f/a/b/h/g;

    return-void
.end method
