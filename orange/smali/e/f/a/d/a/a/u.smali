.class public final Le/f/a/d/a/a/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Le/f/a/d/a/a/h;


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le/f/a/d/a/a/v;
    .locals 2

    iget-object v0, p0, Le/f/a/d/a/a/u;->a:Le/f/a/d/a/a/h;

    const-class v1, Le/f/a/d/a/a/h;

    invoke-static {v0, v1}, Le/f/a/d/a/e/m;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Le/f/a/d/a/a/v;

    iget-object v1, p0, Le/f/a/d/a/a/u;->a:Le/f/a/d/a/a/h;

    invoke-direct {v0, v1}, Le/f/a/d/a/a/v;-><init>(Le/f/a/d/a/a/h;)V

    return-object v0
.end method

.method public final a(Le/f/a/d/a/a/h;)V
    .locals 0

    iput-object p1, p0, Le/f/a/d/a/a/u;->a:Le/f/a/d/a/a/h;

    return-void
.end method
