.class public final synthetic Le/f/c/n/h/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le/f/c/n/c;


# static fields
.field public static final a:Le/f/c/n/h/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/f/c/n/h/a;

    invoke-direct {v0}, Le/f/c/n/h/a;-><init>()V

    sput-object v0, Le/f/c/n/h/a;->a:Le/f/c/n/h/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Le/f/c/n/c;
    .locals 1

    sget-object v0, Le/f/c/n/h/a;->a:Le/f/c/n/h/a;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Le/f/c/n/d;

    invoke-static {p1, p2}, Le/f/c/n/h/f;->a(Ljava/lang/Object;Le/f/c/n/d;)V

    const/4 p1, 0x0

    throw p1
.end method
