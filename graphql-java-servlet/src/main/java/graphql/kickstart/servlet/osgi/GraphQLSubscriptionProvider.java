package graphql.kickstart.servlet.osgi;

import graphql.schema.GraphQLFieldDefinition;
import java.util.Collection;

public interface GraphQLSubscriptionProvider extends GraphQLProvider {

  Collection<GraphQLFieldDefinition> getSubscriptions();
}
