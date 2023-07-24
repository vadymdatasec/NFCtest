.class public final synthetic Le/f/a/a/i/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/a/a/j/i0/c;


# static fields
.field public static final a:Le/f/a/a/i/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/a/a/i/d;

    invoke-direct {v0}, Le/f/a/a/i/d;-><init>()V

    sput-object v0, Le/f/a/a/i/d;->a:Le/f/a/a/i/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/a/a/j/i0/c;
    .locals 1

    sget-object v0, Le/f/a/a/i/d;->a:Le/f/a/a/i/d;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le/f/a/a/i/e;

    check-cast p2, Le/f/a/a/i/f;

    invoke-static {p1, p2}, Le/f/a/a/i/g;->a(Le/f/a/a/i/e;Le/f/a/a/i/f;)Le/f/a/a/i/e;

    move-result-object p1

    return-object p1
.end method
