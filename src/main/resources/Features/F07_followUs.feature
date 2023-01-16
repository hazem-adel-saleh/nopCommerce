@smoke
  Feature: F07_followUs | users can use follow us links to get store pages
    Scenario: user open facebook link
      When user click on facebook icon
      Then user redirected to facebook page "facebook.com/nopCommerce"

    Scenario: user open twitter link
      When user click on twitter icon
      Then user redirected to twitter page "twitter.com/nopCommerce"

    Scenario: user open RSS link
      When user click on RSS icon
      Then user redirected to RSS page "demo.nopcommerce.com/news/rss/1"

    Scenario: user open youtube link
      When user click on youtube icon
      Then user redirected to youtube page "youtube.com/user/nopCommerce"